package com.certification.datalistgridtable.practice_project.modules.cats;

import com.certification.datalistgridtable.practice_project.MainTabMenu;
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
import java.util.Comparator;

import static com.certification.datalistgridtable.practice_project.config.AppRoutes.CATS_ROUTE;
import static com.certification.datalistgridtable.practice_project.config.AppTitles.CATS_TAB_TITLE;
import static com.certification.datalistgridtable.practice_project.utils.ViewUtils.enableColumnSorting;


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

    load_Grid_LazyDataProvider(grid);

    return grid;
  }

  private void load_Grid_LazyDataProvider(Grid<Cat> grid) {

    // create lazy Data Provider using the PersonService
    final CallbackDataProvider<Cat, AgeGroup>
         lazyDataProvider =
         DataProvider
              .fromFilteringCallbacks(
                   query -> catService
                        .fetchCallBack_fetchLazyGetAll(
                             query.getOffset(),
                             query.getLimit(),
                             query.getFilter()
                                  .orElse(null)
                        ),
                   query -> catService
                        .countCallBack_totalizeLazyGetAll(
                             query.getOffset(),
                             query.getLimit(),
                             query.getFilter()
                                  .orElse(null)
                        )
              );

    final ConfigurableFilterDataProvider<Cat, Void, AgeGroup>
         lazyFilterProvider = lazyDataProvider.withConfigurableFilter();

    grid.setItems(lazyFilterProvider);

    // add value change listener to comboFilter and update the DataProvider
    // accordingly
    var ageGroups = new ArrayList<AgeGroup>();
    ageGroups.add(new AgeGroup(1, 4));
    ageGroups.add(new AgeGroup(5, 8));
    ageGroups.add(new AgeGroup(9, 10));

    var comboFilter = new ComboBox<AgeGroup>();
    comboFilter.setItems(ageGroups);

    grid
         .prependHeaderRow()
         .getCell(grid.getColumnByKey("age"))
         .setComponent(comboFilter);

    comboFilter
         .addValueChangeListener(
              valueChanged -> {
                var ageGroup = valueChanged.getValue();
                lazyFilterProvider.setFilter(ageGroup);
              });
  }

  private void configure_View() {

    setSpacing(false);
    setSizeFull();
    setJustifyContentMode(JustifyContentMode.CENTER);
    setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    getStyle().set("text-align", "center");
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

  private void define_GridSorting_View(Grid<Cat> grid) {

    // BeanGrid: Sorting + setComparator
    grid.getColumnByKey("age")
        .setComparator(Comparator.comparingInt(Cat::getAge));

    // BeanGrid: MultiSorting
    enableColumnSorting(grid, "name", "age");
    grid.setMultiSort(true, Grid.MultiSortPriority.PREPEND);
  }
}