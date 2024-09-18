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

import static com.certification.datalistgridtable.practice_project.utils.ViewUtils.enableColumnSorting;
import static com.vaadin.flow.component.notification.Notification.show;


@PageTitle("Dogs")
@Route(value = "dogs", layout = MainTabMenu.class)
public class DogsView extends VerticalLayout {

  private DogService dogService = new DogService();

  public DogsView() {

    configureView();

    Grid<Dog> grid = createGrid();
    grid.setItems(dogService.getAllDogs());

    add(grid);
  }

  private void configureView() {

    setSpacing(false);
    setSizeFull();
    setJustifyContentMode(JustifyContentMode.CENTER);
    setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    getStyle().set("text-align", "center");
  }

  private static Grid<Dog> createGrid() {

    Grid<Dog> grid = new Grid<>(Dog.class);

    // BeanGrid: Instanciacao Programatica
    grid.setColumns("name", "breed", "age", "weight", "gender", "status");

    // BeanGrid: Renderer ByKeyColumn
    grid.getColumnByKey("age")
        .setRenderer(new TextRenderer<>(dog -> new DecimalFormat("00").format(dog.getAge())));


    // BeanGrid: Sorting + setComparator
    grid.getColumnByKey("age")
        .setComparator(Comparator.comparingInt(Dog::getAge));

    grid.getColumnByKey("weight")
        .setRenderer(new TextRenderer<>(dog -> new DecimalFormat("00.00").format(dog.getWeight())));

    // BeanGrid: MultiSorting
    enableColumnSorting(grid, "name", "age");
    grid.setMultiSort(true, Grid.MultiSortPriority.PREPEND);

    // BeanGrid: Selection Mode - MULTI
    grid.setSelectionMode(Grid.SelectionMode.MULTI);

    // BeanGrid: Selection - 'asMultiSelect' Values
    grid.addSelectionListener(event -> {
      Set<Dog> dogs = grid.asMultiSelect().getValue();

    // BeanGrid: Selection - Getting 'getSelectedItems' Values
      Set<Dog> dogs2 = grid.getSelectedItems();
      show("Selected Dog(s): " +
           dogs2.stream()
                .map(Dog::getName)
                .collect(Collectors.joining(", \n")) +
           " - Total:" + dogs.size());
    });

    return grid;
  }
}