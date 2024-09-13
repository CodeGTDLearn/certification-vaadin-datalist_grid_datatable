package com.certification.datalistgridtable.practice_project.tabViews.fosters;

import com.certification.datalistgridtable.practice_project.tabViews.dogs.Dog;
import com.certification.datalistgridtable.practice_project.utils.DataFaker;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.certification.datalistgridtable.practice_project.tabViews.dogs.DogService.getAllDogs;


public class FosterService {

  private static final int FOSTER_QUANTITY = 10;

  public List<Foster> getAllFosters() {

    List<Foster> fosters = new ArrayList<>();

    for (int i = 0; i < FOSTER_QUANTITY; i++) {
      Foster foster = new Foster(
           UUID.randomUUID()
               .toString(),
           DataFaker.fullName(),
           DataFaker.phoneNumber(),
           generateDogsFostered()
      );
      fosters.add(foster);
    }

    return fosters;
  }

  private List<Dog> generateDogsFostered() {

    List<Dog> fosteredDogs = new ArrayList<>();
    int totalDogs = DataFaker.randomInteger(1, 5);

    var repoListDogs = getAllDogs();

    for (int i = 0; i < totalDogs; i++) {
      Dog dog = repoListDogs.get(i);
      fosteredDogs.add(dog);
    }

    return fosteredDogs;
  }
}