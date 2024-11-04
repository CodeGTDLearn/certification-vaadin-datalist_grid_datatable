package com.certification.datalistgridtable.practice_project.utils;

import com.vaadin.flow.component.grid.Grid;

import java.util.Arrays;

public class ViewUtils {
  public static <E> void enableColumnSorting(
       Grid<E> grid,
       String... columns
  ) {

    // BeanGrid: enable Sortings
    grid.getColumns()
        .forEach(column -> column.setSortable(false));

    Arrays
         .stream(columns)
         .forEach(column ->
                       grid.getColumnByKey(column)
                           .setSortable(true));


    grid.getColumnByKey("name")
        .setSortable(true);
  }
}