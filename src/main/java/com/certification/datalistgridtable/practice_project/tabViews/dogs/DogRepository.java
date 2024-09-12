package com.certification.datalistgridtable.practice_project.tabViews.dogs;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.certification.datalistgridtable.practice_project.utils.DataFaker.*;


public class DogRepository {

  private static final int DOG_QUANTITY = 30;

  public static List<Dog> getAllDogs() {

    List<Dog> dogs = new ArrayList<>();

    for (int i = 0; i < DOG_QUANTITY; i++) {
      final String[] dogStatus = {"Adopted", "Available", "Pending"};
      Dog dog = new Dog(
           UUID.randomUUID().toString(),
           Fake.DogName(),
           Fake.RandomInteger(1, 20),
           Fake.DogBreed(),
           Fake.Gender(),
           Fake.RandomDouble(1.0, 50.0),
           Fake.Address(),
           Fake.FullName(),
           new ArrayList<>(),
           Fake.RandomOption(dogStatus)
      );
      dogs.add(dog);
    }

    return dogs;
  }
}