package com.certification.datalistgridtable.practice_project.tabViews.breeds;

import com.certification.datalistgridtable.practice_project.MainTabMenu;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.grid.contextmenu.GridContextMenu;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.NativeButtonRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import lombok.AllArgsConstructor;

import java.util.List;

import static com.certification.datalistgridtable.practice_project.config.AppRoutes.BREEDS_ROUTE;
import static com.certification.datalistgridtable.practice_project.config.AppTitles.BREEDS_TAB_TITLE;
import static com.vaadin.flow.component.notification.Notification.show;

@PageTitle(BREEDS_TAB_TITLE)
@Route(value = BREEDS_ROUTE, layout = MainTabMenu.class)
@AllArgsConstructor
public class BreedView extends VerticalLayout {

  private BreedService breedService = new BreedService();

  private List<Breed> breeds;

  private Grid<Breed> grid = new Grid<>(Breed.class);

  public BreedView() {

    breeds = breedService.getBreeds();

    configure_View();

    grid = create_Grid();

    define_GridLine_DetailRow(grid);

    define_GridColumnEditor_BreedName(grid);

    define_GridContextMenu(grid);

    define_GridTooltip(grid);

    add(grid);
  }

  private void define_GridTooltip(Grid<Breed> grid) {

    grid.setTooltipGenerator(breed -> {
      return "Breed: " + breed.getBreedName();
    });

    grid.getColumnByKey("origin")
        .setTooltipGenerator(breed -> {
          return "City was found: " + breed.getOrigin();
        });
  }

  private void define_GridContextMenu(Grid<Breed> grid) {

    var contextMenu = new GridContextMenu<Breed>(grid);

    contextMenu.addItem(
         "Show Breed",
         gridItem -> show(
              "Details: " + gridItem.getItem()
                                    .get()
                                    .getBreedName()
         )
    );
  }

  private void configure_View() {

    setSpacing(false);
    setSizeFull();
    setJustifyContentMode(JustifyContentMode.CENTER);
    setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    getStyle().set("text-align", "center");
  }

  private Grid<Breed> create_Grid() {

    var grid = new Grid<>(Breed.class);

    grid.removeColumnByKey("id");
    grid.removeColumnByKey("name");
    grid.removeColumnByKey("imageUrl");

    // BeanGrid:Injecao de Dados c/ Stream
    grid
         .setItems(
              breeds.stream()
                    .distinct()
                    .filter(
                         breed -> breeds.stream()
                                        .filter(b2 -> ! breed.equals(b2))
                                        .noneMatch(b2 -> breed.getBreedName()
                                                              .equals(b2.getBreedName())))
                    .toList()
         );

    grid.addThemeVariants(GridVariant.LUMO_ROW_STRIPES);

    return grid;
  }

  private void define_GridColumnEditor_BreedName(Grid<Breed> grid) {

    var breedColumnField = new TextField();

    var breedColumn = grid.getColumnByKey("breedName");
    breedColumn.setEditorComponent(breedColumnField);

    var binder = new Binder<>(Breed.class);
    binder.bind(breedColumnField, "breedName");

    grid.getEditor().setBinder(binder);

    grid.addItemDoubleClickListener(
         clickEvent -> {
           grid.getEditor().editItem(clickEvent.getItem());
         }
    );

  }

  private void define_GridLine_DetailRow(Grid<Breed> grid) {

    grid.setItemDetailsRenderer(
         new ComponentRenderer<>(
              breed -> {

                var detailRow = new HorizontalLayout();
                detailRow.setWidthFull();
                detailRow.setHeight("100px");

                var image = new Image(breed.getImageUrl(), "Photo");
                image.setMaxWidth("10%");
                image.setHeight("100%");

                var columnData = new VerticalLayout();
                columnData.setMaxWidth("30%");
                columnData.setHeight("100%");

                columnData.add(new Text("Dogs Name: " + breed.getBreedName()));
                columnData.add(new Text("Dogs Temperament: " + breed.getTemperament()));
                columnData.add(new Text("Dogs Origin: " + breed.getOrigin()));

                columnData.setAlignSelf(Alignment.STRETCH, image);

                detailRow.add(image, columnData);

                return detailRow;
              }
         )
    );

    grid.setDetailsVisibleOnClick(false);

    grid.addColumn(
         new NativeButtonRenderer<>(
              "Check Details",
              breed -> grid.setDetailsVisible(breed, ! grid.isDetailsVisible(breed)
              )
         ));

    grid.setSelectionMode(Grid.SelectionMode.NONE);
  }

}