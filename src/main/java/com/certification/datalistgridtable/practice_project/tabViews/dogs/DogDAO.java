package com.certification.datalistgridtable.practice_project.tabViews.dogs;

import com.certification.datalistgridtable.practice_project.utils.DataFaker;
import org.springframework.stereotype.Repository;

import java.util.*;

import static com.certification.datalistgridtable.practice_project.utils.DataFaker.randomOptions;


public class DogDAO {

  public static List<Dog> getAllDogs() {

    var DogQuantity = new Random().nextInt(1,7);

    List<Dog> dogs = new ArrayList<>();
    String[] dogStatus = {"Adopted", "Available", "Pending"};

    Random random = new Random();

    for (int i = 0; i < DogQuantity; i++) {

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

      dogs.add(dog);
    }

    return dogs;
  }
}