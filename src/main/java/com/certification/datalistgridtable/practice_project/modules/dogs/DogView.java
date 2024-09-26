package com.certification.datalistgridtable.practice_project.modules.dogs;

import com.certification.datalistgridtable.practice_project.MainTabMenu;
import com.certification.datalistgridtable.practice_project.utils.DataBuilders;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.dataview.GridListDataView;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.certification.datalistgridtable.practice_project.config.AppRoutes.DOGS_ROUTE;
import static com.certification.datalistgridtable.practice_project.config.AppTitles.DOGS_TAB_TITLE;
import static com.certification.datalistgridtable.practice_project.utils.ViewUtils.enableColumnSorting;
import static com.vaadin.flow.component.notification.Notification.show;


@PageTitle(DOGS_TAB_TITLE)
@Route(value = DOGS_ROUTE, layout = MainTabMenu.class)
public class DogView extends VerticalLayout {

  private DogService dogService = new DogService();
  private Grid<Dog> grid = new Grid<>(Dog.class);
  private GridListDataView<Dog> dataView;

  public DogView() {

    configure_View();

    grid = create_Grid();

    define_GridSorting_View(grid);

    define_GridSelection_View(grid);

    define_preHeader_filterAgeCombo(grid);

    add(grid);
  }

  private void configure_View() {

    setSpacing(false);
    setSizeFull();
    setJustifyContentMode(JustifyContentMode.CENTER);
    setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    getStyle().set("text-align", "center");
  }

  private void define_preHeader_filterAgeCombo(Grid<Dog> grid) {

    var comboSize = "35%";
    var comboAgeStart = new ComboBox<>("Age Start");
    comboAgeStart.setItems(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    comboAgeStart.setWidth(comboSize);

    var comboAgeEnd = new ComboBox<>("Age End");
    comboAgeEnd.setItems(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    comboAgeEnd.setWidth(comboSize);

    var filterButton = new Button("Filter");
    filterButton
         .addClickListener(e -> {

           if (comboAgeStart.isEmpty()) comboAgeStart.setValue(0);
           if (comboAgeEnd.isEmpty()) comboAgeEnd.setValue(Integer.MAX_VALUE);

           dataView
                .setFilter(
                     dog -> dog.getAge() >= (int) comboAgeStart.getValue() &&
                            dog.getAge() <= (int) comboAgeEnd.getValue()
                )
                .refreshAll();

           comboAgeStart.clear();
           comboAgeEnd.clear();
         });

    var box = new HorizontalLayout();
    box.add(comboAgeStart, comboAgeEnd, filterButton);

    var headerRow = grid.prependHeaderRow();
    headerRow
         .getCell(grid.getColumnByKey("age"))
         .setComponent(box);

  }

  private Grid<Dog> create_Grid() {

    Grid<Dog> grid = new Grid<>(Dog.class);

    // BeanGrid: Instanciacao Programatica
    grid.setColumns("name", "breed", "age", "weight", "gender", "status");

    // BeanGrid: Renderer ByKeyColumn
    grid
         .getColumnByKey("age")
         .setRenderer(
              new TextRenderer<>(
                   dog -> new DecimalFormat("00").format(dog.getAge())
              )
         );

    grid.getColumnByKey("weight")
        .setRenderer(new TextRenderer<>(dog -> new DecimalFormat("00.00").format(dog.getWeight())));

    var dataProvider = define_GridSorting_DataProvider(dogService.getAllDogs());

    dataView = grid.setItems(dataProvider);

    define_GridHeaderDogName_AddDogButton(grid);

    define_GridHeaderBreed_RemoveDogButton(grid);

    return grid;
  }

  private void define_GridSelection_View(Grid<Dog> grid) {
    // BeanGrid: Selection Mode - MULTI
    grid.setSelectionMode(Grid.SelectionMode.MULTI);

    // BeanGrid: Selection - 'asMultiSelect' Values
    grid.addSelectionListener(event -> {
      Set<Dog> dogs = grid.asMultiSelect()
                          .getValue();

      // BeanGrid: Selection - Getting 'getSelectedItems' Values
      Set<Dog> dogs2 = grid.getSelectedItems();
      show("Selected Dog(s): " +
           dogs2.stream()
                .map(Dog::getName)
                .collect(Collectors.joining(", \n")) +
           " - Total:" + dogs.size());
    });
  }

  private void define_GridSorting_View(Grid<Dog> grid) {

    // BeanGrid: Sorting + setComparator
    grid.getColumnByKey("age")
        .setComparator(Comparator.comparingInt(Dog::getAge));

    // BeanGrid: MultiSorting
    enableColumnSorting(grid, "name", "age");
    grid.setMultiSort(true, Grid.MultiSortPriority.PREPEND);
  }

  private ListDataProvider<Dog> define_GridSorting_DataProvider(List<Dog> list) {

    ListDataProvider<Dog> dataProvider = DataProvider.ofCollection(list);
    dataProvider.setSortComparator(Comparator.comparing(Dog::getName)::compare);

    return dataProvider;
  }

  private void define_GridHeaderDogName_AddDogButton(Grid<Dog> grid) {

    var addButton = new Button("Add a Dog");

    addButton.addClickListener(e -> {
      dataView.addItem(DataBuilders.createDog());
      grid.getDataProvider()
          .refreshAll();
    });

    var preHeader = grid.prependHeaderRow();

    Div div = new Div();
    div.add(addButton);

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

  private void define_GridHeaderBreed_RemoveDogButton(Grid<Dog> grid) {

    var removeButton = new Button("Delete a Dog");

    removeButton.addClickListener(e -> {
      dataView.removeItem(dataView.getItems()
                                  .iterator()
                                  .next());
      grid.getDataProvider()
          .refreshAll();
    });

    var header = grid.getHeaderRows()
                     .get(0);

    Div div = new Div();
    div.add(removeButton);

    div.getElement()
       .getStyle()
       .set("position", "relative");
    div.getElement()
       .getStyle()
       .set("text-align", "center");

    header
         .getCell(grid.getColumnByKey("breed"))
         .setComponent(div);
  }
}