package com.certification.datalistgridtable.fosterCareHub.modules.cats;

import java.util.ArrayList;
import java.util.List;

import static com.certification.datalistgridtable.fosterCareHub.utils.DataBuilders.createCat;

public class CatRepo {
  private static final int TOTAL_CATS = 7;
  private static final int TOTAL_BIG_QTDE = 100;


  public static List<Cat> getAllCatsBigQuantity() {

    List<Cat> cats = new ArrayList<>();

    for (int i = 0; i < TOTAL_BIG_QTDE; i++) cats.add(createCat());

    return cats;
  }

  public static List<Cat> getAllCats() {

    List<Cat> cats = new ArrayList<>();

    for (int i = 0; i < TOTAL_CATS; i++) cats.add(createCat());


    return cats;
  }

}