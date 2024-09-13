package com.certification.datalistgridtable.practice_project.tabViews.dogs;

import com.certification.datalistgridtable.practice_project.utils.DataFaker;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class DogService {

  private static final int DOG_QUANTITY = 30;

  public static List<Dog> getAllDogs() {

    List<Dog> dogs = new ArrayList<>();

    for (int i = 0; i < DOG_QUANTITY; i++) {
      final String[] dogStatus = {"Adopted", "Available", "Pending"};
      Dog dog = new Dog(
           UUID.randomUUID().toString(),
           DataFaker.dogName(),
           DataFaker.randomInteger(1, 20),
           DataFaker.dogBreed(),
           DataFaker.gender(),
           DataFaker.randomDouble(1.0, 50.0),
           DataFaker.address(),
           DataFaker.fullName(),
           new ArrayList<>(),
           DataFaker.randomOption(dogStatus)
      );
      dogs.add(dog);
    }

    return dogs;
  }
}