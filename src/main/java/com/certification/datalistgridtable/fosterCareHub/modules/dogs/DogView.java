package com.certification.datalistgridtable.fosterCareHub.modules.dogs;

import com.certification.datalistgridtable.fosterCareHub.MainTabMenu;
import com.certification.datalistgridtable.fosterCareHub.utils.DataBuilders;
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
import java.util.Set;
import java.util.stream.Collectors;

import static com.certification.datalistgridtable.fosterCareHub.config.AppRoutes.DOGS_ROUTE;
import static com.certification.datalistgridtable.fosterCareHub.config.AppTitles.DOGS_TAB_TITLE;
import static com.certification.datalistgridtable.fosterCareHub.utils.ViewUtils.enableColumnSorting;
import static com.vaadin.flow.component.notification.Notification.show;


@PageTitle(DOGS_TAB_TITLE)
@Route(value = DOGS_ROUTE, layout = MainTabMenu.class)
public class DogView extends VerticalLayout {

  private GridListDataView<Dog> dataView;
  private Grid<Dog> grid = new Grid<>(Dog.class);
  private DogService dogService = new DogService();

  public DogView() {

    configure_View();

    grid = create_Grid();

    define_GridSorting_View(grid);

    define_GridSelection_View(grid);

    define_preHeader_RangeAgeFilterCombo(grid);

    add(grid);
  }

  private Grid<Dog> create_Grid() {

    Grid<Dog> grid = new Grid<>(Dog.class);

    // BeanGrid: Instanciacao Programatica
    grid.setColumns("name", "breed", "age", "weight", "gender", "status");

    format_Grid_Columns(grid);

    ListDataProvider<Dog> load_Grid_MemoryDataProvider = DataProvider.ofCollection(dogService.getAllDogs());

    var dataProvider = define_GridSorting_DataProvider(load_Grid_MemoryDataProvider);

    dataView = grid.setItems(dataProvider);

    define_GridHeaderDogName_AddDogButton(grid);

    define_GridHeaderBreed_RemoveDogButton(grid);

    return grid;
  }

  private void configure_View() {

    setSpacing(false);
    setSizeFull();
    setJustifyContentMode(JustifyContentMode.CENTER);
    setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    getStyle().set("text-align", "center");
  }

  private void define_preHeader_RangeAgeFilterCombo(Grid<Dog> grid) {

    var size = "25%";
    Integer[] ages = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    var ageStart = new ComboBox<>();
    ageStart.setItems(ages);
    ageStart.setWidth(size);
    ageStart.setValue(1);
    ageStart.setRequired(true);

    var ageEnd = new ComboBox<>();
    ageEnd.setItems(ages);
    ageEnd.setWidth(size);
    ageEnd.setValue(10);
    ageEnd.setRequired(true);

    var filterButton = new Button("Range");
    filterButton.setWidth("30%");

    filterButton
         .addClickListener(click -> {
           dataView.setFilter(
                        dog -> dog.getAge() >= (int) ageStart.getValue() &&
                               dog.getAge() <= (int) ageEnd.getValue()
                   )
                   .refreshAll();
         });

    var box = new HorizontalLayout();
    box.add(ageStart, ageEnd, filterButton);

    var headerRow = grid.prependHeaderRow();
    headerRow
         .getCell(grid.getColumnByKey("age"))
         .setComponent(box);

  }

  private static void format_Grid_Columns(Grid<Dog> grid) {
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

  private ListDataProvider<Dog> define_GridSorting_DataProvider(ListDataProvider<Dog> dataProvider) {

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