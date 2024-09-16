package com.certification.datalistgridtable.practice_project.tabViews.dogs;

import com.certification.datalistgridtable.practice_project.utils.DataFaker;

import java.util.*;

import static com.certification.datalistgridtable.practice_project.utils.DataFaker.randomOptions;


public class DogService {

  private static final int DOG_QUANTITY = 30;

  public DogService() {

    generateDogs();
  }

  private static List<Dog> generateDogs() {

    List<Dog> dogs = new ArrayList<>();
    String[] dogStatus = {"Adopted", "Available", "Pending"};

    Random random = new Random();

    for (int i = 0; i < DOG_QUANTITY; i++) {

      var fosters = Arrays.asList(randomOptions(
           random.nextInt(1, 5),
           DataFaker.fullName(),
           DataFaker.fullName(),
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

      dogs.add(dog);
    }

    return dogs;
  }

  public static List<Dog> getAllDogs() {

    return generateDogs();
  }


}