package com.certification.datalistgridtable.practice_project.tabViews.fosters;

import com.certification.datalistgridtable.practice_project.TabMainMenu;
import com.certification.datalistgridtable.practice_project.tabViews.dogs.Dog;
import com.vaadin.flow.component.grid.Grid;
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

  private final FosterRepository repo = new FosterRepository();
  private final List<Foster> fosters;
  private Grid<Foster> grid;

  public FostersView() {

    fosters = repo.getAllFosters();

    setSpacing(false);
    setSizeFull();
    setJustifyContentMode(JustifyContentMode.CENTER);
    setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    getStyle().set("text-align", "center");

    grid = new Grid<>(Foster.class);
    grid = createGrid();
    grid.setItems(fosters);

    add(grid);
  }

  private Grid<Foster> createGrid() {

    grid.setColumns(
         "name",
         "contactInfo"
    );

    int totalDogsFostered =
         fosters.stream()
                .mapToInt(
                     foster -> foster.getDogsFostered()
                                     .size())
                .sum();

    grid
         .addColumn(
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

    return grid;
  }

}