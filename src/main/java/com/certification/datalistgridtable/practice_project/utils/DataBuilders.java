package com.certification.datalistgridtable.practice_project.utils;

import com.certification.datalistgridtable.practice_project.modules.dogs.Dog;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import static com.certification.datalistgridtable.practice_project.utils.DataFaker.randomOptions;

public class DataBuilders {

  private static String[] dogStatus = {"Adopted", "Available", "Pending"};

  private static Random random = new Random();

  public static Dog createDog() {

    var fosters =
         Arrays.asList(
              randomOptions(
                   random.nextInt(1, 3),
                   DataFaker.fullName(),
                   DataFaker.fullName(),
                   DataFaker.fullName()
              ));

    Dog dog = new Dog(
         UUID.randomUUID()
             .toString(),
         DataFaker.dogName(),
         random.nextInt(1, 20),
         DataFaker.dogBreed(),
         DataFaker.gender(),
         random.nextDouble(0, 50.0),
         DataFaker.address(),
         DataFaker.fullName(),
         fosters,
         DataFaker.randomOption(dogStatus)
    );

    return dog;
  }
}