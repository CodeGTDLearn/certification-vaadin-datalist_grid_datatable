package com.certification.datalistgridtable.practice_project.tabViews.fosters;

import com.certification.datalistgridtable.practice_project.MainTabMenu;
import com.certification.datalistgridtable.practice_project.tabViews.dogs.Dog;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.ItemClickEvent;
import com.vaadin.flow.component.grid.ItemDoubleClickEvent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.ValidationException;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import static com.certification.datalistgridtable.practice_project.config.AppRoutes.FOSTERS_ROUTE;
import static com.certification.datalistgridtable.practice_project.config.AppTitles.FOSTERS_TAB_TITLE;
import static com.vaadin.flow.component.notification.Notification.show;

@PageTitle(FOSTERS_TAB_TITLE)
@Route(value = FOSTERS_ROUTE, layout = MainTabMenu.class)
@RouteAlias(value = "", layout = MainTabMenu.class)
@AllArgsConstructor
public class FosterView extends VerticalLayout {

  private FosterService fosterService = new FosterService();

  private List<Foster> fosters;
  private Grid<Foster> grid = new Grid<>(Foster.class);

  public FosterView() {

    fosters = fosterService.getAllFosters();

    configure_View();

    // BeanGrid:Instanciacao Automatica
    grid = create_Grid();

    define_GridHeader_MultipleDogsFosters(grid);

    define_GridSelection(grid);

    define_GridColumnEditor_ContactInfo(grid);

    add(grid);
  }

  private void configure_View() {

    setSpacing(false);
    setSizeFull();
    setJustifyContentMode(JustifyContentMode.CENTER);
    setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    getStyle().set("text-align", "center");
  }

  private Grid<Foster> create_Grid() {

    var grid = new Grid<>(Foster.class);

    // BeanGrid: Selecao/Ordenacao de Colunas na Instanciacao Automatica
    grid.setColumns(
         "name",
         "contactInfo"
    );

    int totalDogsFostered = calculate_TotalDogsFostered();

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

    // BeanGrid:Injecao de Dados c/ Stream
    grid.setItems(
         fosters
              .stream()
              .filter(foster -> foster.getName()
                                      .length() > 3)
              .toList()
    );

    return grid;
  }

  private void define_GridSelection(Grid<Foster> grid) {

    // BeanGrid: Selection Mode - SINGLE
    grid.setSelectionMode(Grid.SelectionMode.SINGLE);

    // BeanGrid: Selection - asSingleSelect
    grid.addSelectionListener(
         selection -> {
           var foster = grid.asSingleSelect()
                            .getValue();
           if (foster != null) show("Chosen Foster: " + foster.getName());
         });

    var preFooter = grid.appendFooterRow();

    preFooter
         .getCell(grid.getColumnByKey("name"))
         .setComponent(define_GridFooter_SearchFosterButton());
  }

  private Div define_GridFooter_SearchFosterButton() {

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

    Div div = new Div(searchField, searchButton);
    return div;
  }

  private void define_GridColumnEditor_ContactInfo(Grid<Foster> grid) {

    var binder = new Binder<>(Foster.class);
    var contactField = new TextField();

    grid
         .getColumnByKey("contactInfo")
         .setEditorComponent(contactField);

    binder.bind(contactField, "contactInfo");

    grid.getEditor().setBuffered(true);

    grid.addItemClickListener(click -> close_GridColumnEditor(grid, click));

    grid.addItemDoubleClickListener(
         click -> {

           close_GridColumnEditor(grid, click);

           binder.readBean(click.getItem());
           grid.getEditor().editItem(click.getItem());

           var buttons = create_GridColumnEditor_Buttons(grid, click, binder);

           grid.setDetailsVisible(click.getItem(), true);
           grid.setItemDetailsRenderer(new ComponentRenderer<>(item -> buttons));
         }
    );
  }

  private static Div create_GridColumnEditor_Buttons(
       Grid<Foster> grid,
       ItemClickEvent<Foster> event,
       Binder<Foster> binder) {
    

    var saveButton = new Button("Save");
    saveButton.addClickListener(e -> {
           try {
             binder.writeBean(event.getItem());
           }
           catch (ValidationException ex) {
             throw new RuntimeException(ex);
           }
           close_GridColumnEditor(grid, event);
         });


    var discardButton = new Button("Discard");
    discardButton.addClickListener(e -> {
           binder.readBean(event.getItem());
           close_GridColumnEditor(grid, event);
         });

    Div divButtons = new Div();
    divButtons.add(saveButton, discardButton);

    return divButtons;
  }

  private static void close_GridColumnEditor(
       Grid<Foster> grid,
       ItemClickEvent<Foster> event
  ) {

    grid.getEditor().cancel();
    grid.setDetailsVisible(event.getItem(), false);
  }

  // Grid: prependHeaderRow (Extra Row no Header)
  private void define_GridHeader_MultipleDogsFosters(Grid<Foster> grid) {

    var title = "Fostering Multiple Dogs: ";

    var preHeader = grid.prependHeaderRow();

    Div div = new Div();
    div.setText(title + calculate_TotalOfFostersWithMultipleDogs());
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

  private int calculate_TotalDogsFostered() {

    return
         fosters.stream()
                .mapToInt(
                     foster -> foster.getDogsFostered()
                                     .size())
                .sum();
  }

  private long calculate_TotalOfFostersWithMultipleDogs() {

    return
         fosters.stream()
                .filter(foster -> foster.getDogsFostered()
                                        .size() > 1)
                .count();
  }

}