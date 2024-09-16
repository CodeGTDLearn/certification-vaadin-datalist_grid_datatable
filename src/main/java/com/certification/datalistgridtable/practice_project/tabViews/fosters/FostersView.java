package com.certification.datalistgridtable.practice_project.tabViews.fosters;

import com.certification.datalistgridtable.practice_project.TabMainMenu;
import com.certification.datalistgridtable.practice_project.tabViews.dogs.Dog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

import java.util.List;
import java.util.stream.Collectors;

@PageTitle("Owners")
@Route(value = "", layout = TabMainMenu.class)
@RouteAlias(value = "", layout = TabMainMenu.class)
public class FostersView extends VerticalLayout {

  private final FosterService service = new FosterService();
  private final List<Foster> fosters;
  private Grid<Foster> grid;

  public FostersView() {

    fosters = service.getAllFosters();

    setSpacing(false);
    setSizeFull();
    setJustifyContentMode(JustifyContentMode.CENTER);
    setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    getStyle().set("text-align", "center");

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

  private Grid<Foster> createGrid() {

    // BeanGrid: Selecao/Ordenacao de Colunas na Instanciacao Automatica
    grid.setColumns(
         "name",
         "contactInfo"
    );

    final int totalDogsFostered = getTotalDogsFostered();

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
        .setHeader("Fostered Dogs - QTDE:" + totalDogsFostered)
        .setFooter("Currently Fostered Dogs Total: " + totalDogsFostered);

    multipleDogsFosterpreHeader();

    return grid;
  }

  // Grid: prependHeaderRow (EXtra Row no Header)
  private void multipleDogsFosterpreHeader() {

    final String title = "Fostering Multiple Dogs: ";

    var preHeader = grid.prependHeaderRow();

    Div div = new Div();
    div.setText(title + getMultipleDogsFoster());
    div.getElement().getStyle().set("position", "relative");
    div.getElement().getStyle().set("text-align", "center");

    preHeader
         .getCell(grid.getColumnByKey("name"))
         .setComponent(div);
  }

  private int getTotalDogsFostered() {

    int totalDogsFostered =
         fosters.stream()
                .mapToInt(
                     foster -> foster.getDogsFostered()
                                     .size())
                .sum();
    return totalDogsFostered;
  }

  private long getMultipleDogsFoster() {

    long multipleDogsFoster =
         fosters.stream()
              .filter(foster -> foster.getDogsFostered().size() > 1)
              .count();
    return multipleDogsFoster;
  }

}