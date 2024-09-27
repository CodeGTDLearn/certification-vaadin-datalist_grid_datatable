package com.certification.datalistgridtable.practice_project.utils;

import com.certification.datalistgridtable.practice_project.modules.breeds.Breed;
import com.certification.datalistgridtable.practice_project.modules.cats.Cat;
import com.certification.datalistgridtable.practice_project.modules.dogs.Dog;
import com.certification.datalistgridtable.practice_project.modules.fosters.Foster;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import static com.certification.datalistgridtable.practice_project.utils.DataFaker.randomOptions;

public class DataBuilders {

  private static Random random = new Random();
  private static String[] status = {"Adopted", "Available", "Pending"};

  public static Foster createFoster(List<Dog> allDogs) {

    return
         new Foster(
         UUID.randomUUID().toString(),
         DataFaker.fullName(),
         DataFaker.phoneNumber(),
         allDogs
    );
  }

  public static Dog createDog() {

    return
         new Dog(
         UUID.randomUUID().toString(),
         DataFaker.dogName(),
         random.nextInt(1, 10),
         DataFaker.dogBreed(),
         DataFaker.gender(),
         random.nextDouble(0, 50.0),
         DataFaker.address(),
         DataFaker.fullName(),
         generateFosterList(),
         DataFaker.randomOption(status)
    );
  }

  public static Breed createDogBreed() {

    return
         new Breed(
         UUID.randomUUID().toString(),
         DataFaker.dogBreed(),
         DataFaker.city(),
         DataFaker.behavior(),
         DataFaker.dogName(),
         DataFaker.imageDog()
    );
  }

  public static Cat createCat() {

    return
         new Cat(
         UUID.randomUUID()
             .toString(),
         DataFaker.catName(),
         random.nextInt(1, 10),
         DataFaker.catBreed(),
         DataFaker.gender(),
         random.nextDouble(0, 10.0),
         DataFaker.address(),
         DataFaker.fullName(),
         generateFosterList(),
         DataFaker.randomOption(status)
    );
  }

  private static List<String> generateFosterList() {

    return
         Arrays.asList(
              randomOptions(
                   random.nextInt(1, 3),
                   DataFaker.fullName(),
                   DataFaker.fullName(),
                   DataFaker.fullName()
              ));
  }
}