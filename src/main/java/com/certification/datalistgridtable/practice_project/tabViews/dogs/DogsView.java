package com.certification.datalistgridtable.practice_project.tabViews.dogs;

import com.certification.datalistgridtable.practice_project.MainTabMenu;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.text.DecimalFormat;
import java.util.Comparator;

import static com.certification.datalistgridtable.practice_project.utils.ViewUtils.enableColumnSorting;


@PageTitle("Dogs")
@Route(value = "dogs", layout = MainTabMenu.class)
public class DogsView extends VerticalLayout {

  private DogService dogService = new DogService();

  public DogsView() {

    setSpacing(false);
    setSizeFull();
    setJustifyContentMode(JustifyContentMode.CENTER);
    setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    getStyle().set("text-align", "center");

    Grid<Dog> grid = createGrid();
    grid.setItems(dogService.getAllDogs());

    add(grid);
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


    return grid;
  }
}