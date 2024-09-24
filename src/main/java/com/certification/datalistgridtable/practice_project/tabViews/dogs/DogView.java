package com.certification.datalistgridtable.practice_project.tabViews.dogs;

import com.certification.datalistgridtable.practice_project.MainTabMenu;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.text.DecimalFormat;
import java.util.Comparator;
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

  public DogView() {

    configure_View();

    grid = create_Grid();
    grid.setItems(dogService.getAllDogs());

    add(grid);
  }

  private void configure_View() {

    setSpacing(false);
    setSizeFull();
    setJustifyContentMode(JustifyContentMode.CENTER);
    setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    getStyle().set("text-align", "center");
  }

  private static Grid<Dog> create_Grid() {

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

    define_GridSorting(grid);

    define_GridSelection(grid);

    return grid;
  }

  private static void define_GridSelection(Grid<Dog> grid) {
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

  private static void define_GridSorting(Grid<Dog> grid) {

    // BeanGrid: Sorting + setComparator
    grid.getColumnByKey("age")
        .setComparator(Comparator.comparingInt(Dog::getAge));

    // BeanGrid: MultiSorting
    enableColumnSorting(grid, "name", "age");
    grid.setMultiSort(true, Grid.MultiSortPriority.PREPEND);
  }
}