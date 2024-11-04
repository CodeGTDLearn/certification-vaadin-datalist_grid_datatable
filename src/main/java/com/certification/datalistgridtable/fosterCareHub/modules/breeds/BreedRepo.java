package com.certification.datalistgridtable.fosterCareHub.modules.breeds;

import java.util.ArrayList;
import java.util.List;

import static com.certification.datalistgridtable.fosterCareHub.utils.DataBuilders.createDogBreed;

public class BreedRepo {

  private static final int TOTAL_BREEDS = 20;

  public static List<Breed> getBreeds() {

    List<Breed> breeds = new ArrayList<>();

    for (int i = 0; i < TOTAL_BREEDS; i++) breeds.add(createDogBreed());

    return breeds;
  }
}