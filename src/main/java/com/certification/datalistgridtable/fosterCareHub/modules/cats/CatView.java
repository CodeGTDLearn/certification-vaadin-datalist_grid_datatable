package com.certification.datalistgridtable.fosterCareHub.modules.cats;

import com.certification.datalistgridtable.fosterCareHub.MainTabMenu;
import com.certification.datalistgridtable.fosterCareHub.modules.cats.config.AgeRangeFilter;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.provider.CallbackDataProvider;
import com.vaadin.flow.data.provider.ConfigurableFilterDataProvider;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.text.DecimalFormat;
import java.util.ArrayList;

import static com.certification.datalistgridtable.fosterCareHub.config.AppRoutes.CATS_ROUTE;
import static com.certification.datalistgridtable.fosterCareHub.config.AppTitles.CATS_TAB_TITLE;


@PageTitle(CATS_TAB_TITLE)
@Route(value = CATS_ROUTE, layout = MainTabMenu.class)
public class CatView extends VerticalLayout {

  private Grid<Cat> grid = new Grid<>(Cat.class);
  private CatService catService = new CatService();

  public CatView() {

    configure_View();

    grid = create_Grid();

    define_GridSorting_View(grid);

    add(grid);
  }

  private Grid<Cat> create_Grid() {

    Grid<Cat> grid = new Grid<>(Cat.class);

    // BeanGrid: Instanciacao Programatica
    grid.setColumns("name", "breed", "age", "weight", "gender", "status");

    format_Grid_Columns(grid);

    load_Grid_LazyDataProvider_ByAgeFilter(grid);

    return grid;
  }

  private void load_Grid_LazyDataProvider_ByAgeFilter(Grid<Cat> grid) {

    final CallbackDataProvider<Cat, AgeRangeFilter>
         lazyDataProvider =
         DataProvider
              .fromFilteringCallbacks(
                   query -> catService
                        .fetchCallBack_byAgeRangeFilter(
                             query.getOffset(),
                             query.getLimit(),
                             query.getFilter().orElse(null)
                        ),
                   query -> catService
                        .countCallBack_byAgeRangeFilter(
                             query.getOffset(),
                             query.getLimit(),
                             query.getFilter().orElse(null)
                        )
              );

    final ConfigurableFilterDataProvider<Cat, Void, AgeRangeFilter>
         lazyAgeFilterProvider = lazyDataProvider.withConfigurableFilter();

    grid.setItems(lazyAgeFilterProvider);

    // add value change listener to comboFilter and update the DataProvider
    // accordingly
    var ageGroups = new ArrayList<AgeRangeFilter>();
    ageGroups.add(new AgeRangeFilter(1, 4));
    ageGroups.add(new AgeRangeFilter(5, 8));
    ageGroups.add(new AgeRangeFilter(9, 10));

    var comboFilter = new ComboBox<AgeRangeFilter>();
    comboFilter.setItems(ageGroups);

    grid
         .prependHeaderRow()
         .getCell(grid.getColumnByKey("age"))
         .setComponent(comboFilter);

    comboFilter
         .addValueChangeListener(
              valueChanged -> {
                var ageGroup = valueChanged.getValue();
                lazyAgeFilterProvider.setFilter(ageGroup);
              });
  }

  private void configure_View() {

    setSpacing(false);
    setSizeFull();
    setJustifyContentMode(JustifyContentMode.CENTER);
    setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    getStyle().set("text-align", "center");
  }

  private void define_GridSorting_View(Grid<Cat> grid) {

    // Simple columns:
//    grid.removeColumnByKey("age");
    grid.addColumn(Cat::getAge).setSortProperty("age");

    // Combined columns:
//    grid.addColumn(c -> c.getFirstName() + " " + c.getLastName()) .setSortProperty("lastName", "firstName");

  }

  private static void format_Grid_Columns(Grid<Cat> grid) {
    // BeanGrid: Renderer ByKeyColumn
    grid
         .getColumnByKey("age")
         .setRenderer(
              new TextRenderer<>(
                   cat -> new DecimalFormat("00").format(cat.getAge())
              )
         );

    grid.getColumnByKey("weight")
        .setRenderer(new TextRenderer<>(cat -> new DecimalFormat("00.00").format(cat.getWeight())));
  }
}