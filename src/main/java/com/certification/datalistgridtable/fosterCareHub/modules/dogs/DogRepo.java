package com.certification.datalistgridtable.fosterCareHub.modules.dogs;

import java.util.ArrayList;
import java.util.List;

import static com.certification.datalistgridtable.fosterCareHub.utils.DataBuilders.createDog;

public class DogRepo {
  private static final int TOTAL_DOGS = 7;

  public static List<Dog> getAllDogs() {

    List<Dog> dogs = new ArrayList<>();

    for (int i = 0; i < TOTAL_DOGS; i++) dogs.add(createDog());


    return dogs;
  }

}