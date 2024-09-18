package com.certification.datalistgridtable.practice_project.tabViews.fosters;

import com.certification.datalistgridtable.practice_project.MainTabMenu;
import com.certification.datalistgridtable.practice_project.tabViews.dogs.Dog;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import static com.vaadin.flow.component.notification.Notification.show;

@PageTitle("Fosters")
@Route(value = "", layout = MainTabMenu.class)
@RouteAlias(value = "", layout = MainTabMenu.class)
@AllArgsConstructor
public class FostersView extends VerticalLayout {

  private FosterService fosterService = new FosterService();

  private List<Foster> fosters;
  private Grid<Foster> grid;

  public FostersView() {

    fosters = fosterService.getAllFosters();

    configureView();

    // BeanGrid:Instanciacao Automatica
    grid = new Grid<>(Foster.class);
    grid = createGrid();

    // BeanGrid:Injecao de Dados c/ Stream
    grid.setItems(
         fosters
              .stream()
              .filter(f -> f.getName()
                            .length() > 3)
              .toList()
    );

    add(grid);
  }

  private void configureView() {

    setSpacing(false);
    setSizeFull();
    setJustifyContentMode(JustifyContentMode.CENTER);
    setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    getStyle().set("text-align", "center");
  }

  private Grid<Foster> createGrid() {

    // BeanGrid: Selecao/Ordenacao de Colunas na Instanciacao Automatica
    grid.setColumns(
         "name",
         "contactInfo"
    );

    final int totalDogsFostered = countDogsFostered();

    // BeanGrid: Colunas com Header+Footer
    grid.addColumn(
             new TextRenderer<>(
                  foster ->
                       foster
                            .getDogsFostered()
                            .stream()
                            .map(Dog::getName)
                            .collect(Collectors.joining(", "))
             )
        )
        .setHeader("Fostered Dogs - QTDE: " + totalDogsFostered)
        .setFooter("Currently Fostered Dogs Total: " + totalDogsFostered);

    countDogMultipleFosterHeader();

    selectFosterInGrid();

    return grid;
  }

  private void selectFosterInGrid() {

    // BeanGrid: Selection Mode - SINGLE
    grid.setSelectionMode(Grid.SelectionMode.SINGLE);

    // BeanGrid: Selection - asSingleSelect
    grid.addSelectionListener(selection -> {
      var foster = grid.asSingleSelect()
                       .getValue();
      if (foster != null) show("Selected Foster: " + foster.getName());
    });

    final var searchFooter = searchFosterInGridFooter();

    var preFooter = grid.appendFooterRow();
    preFooter
         .getCell(grid.getColumnByKey("name"))
         .setComponent(searchFooter);
  }

  private Div searchFosterInGridFooter() {

    var searchField = new TextField();

    Button searchButton = new Button(
         "Search",
         click -> {

           var searchItem = searchField.getValue();

           fosters
                .stream()
                .filter(foster -> searchItem.equalsIgnoreCase(foster.getName()))
                .findFirst()
                .ifPresentOrElse(
                     foster -> {

                       // BeanGrid: Selection Programatica
                       grid.select(foster);
                       show(foster.getName() + ": Found in Grid.");
                     },
                     () -> show("Sorry... Item not found.")
                );
         }
    );
    Div dd = new Div(searchField, searchButton);
    return dd;
  }

  // Grid: prependHeaderRow (EXtra Row no Header)
  private void countDogMultipleFosterHeader() {

    var title = "Fostering Multiple Dogs: ";

    var preHeader = grid.prependHeaderRow();

    Div div = new Div();
    div.setText(title + getDogMultipleFosters());
    div.getElement()
       .getStyle()
       .set("position", "relative");
    div.getElement()
       .getStyle()
       .set("text-align", "center");

    preHeader
         .getCell(grid.getColumnByKey("name"))
         .setComponent(div);
  }

  private int countDogsFostered() {

    int totalDogsFostered =
         fosters.stream()
                .mapToInt(
                     foster -> foster.getDogsFostered()
                                     .size())
                .sum();

    return totalDogsFostered;
  }

  private long getDogMultipleFosters() {

    long multipleDogsFoster =
         fosters.stream()
                .filter(foster -> foster.getDogsFostered()
                                        .size() > 1)
                .count();
    return multipleDogsFoster;
  }

}