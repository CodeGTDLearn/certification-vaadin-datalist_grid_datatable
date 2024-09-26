package com.certification.datalistgridtable.practice_project.modules.dogs;

import com.certification.datalistgridtable.practice_project.utils.DataBuilders;
import com.certification.datalistgridtable.practice_project.utils.DataFaker;

import java.util.*;


import static com.certification.datalistgridtable.practice_project.utils.DataFaker.randomOptions;

public class DogRepo {

  private static String[] dogStatus = {"Adopted", "Available", "Pending"};

  private static Random random = new Random();

  public static List<Dog> getAllDogs() {

    //    var DogQuantity = new Random().nextInt(1,7);
    var DogQuantity = 7;

    List<Dog> dogs = new ArrayList<>();

    for (int i = 0; i < DogQuantity; i++) {

      var fosters =
           Arrays.asList(
                randomOptions(
                     random.nextInt(1, 3),
                     DataFaker.fullName(),
                     DataFaker.fullName(),
                     DataFaker.fullName()
                ));

      var dog = DataBuilders.createDog();

      dogs.add(dog);
    }

    return dogs;
  }

}