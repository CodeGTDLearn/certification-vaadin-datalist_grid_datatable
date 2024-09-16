package com.certification.datalistgridtable.practice_project.tabViews.dogs;

import com.certification.datalistgridtable.practice_project.TabMainMenu;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import static com.certification.datalistgridtable.practice_project.tabViews.dogs.DogService.getAllDogs;


@PageTitle("Dogs")
@Route(value = "dogs", layout = TabMainMenu.class)
public class DogsView extends VerticalLayout {


  public DogsView() {

    setSpacing(false);
    setSizeFull();
    setJustifyContentMode(JustifyContentMode.CENTER);
    setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    getStyle().set("text-align", "center");

    Grid<Dog> grid = createGrid();
    grid.setItems(getAllDogs());

    add(grid);
  }

  private static Grid<Dog> createGrid() {

    Grid<Dog> grid = new Grid<>(Dog.class);

    return grid;
  }

}