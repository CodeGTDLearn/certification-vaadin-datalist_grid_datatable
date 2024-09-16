package com.certification.datalistgridtable.practice_project.tabViews.fosters;

import com.certification.datalistgridtable.practice_project.utils.DataFaker;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.certification.datalistgridtable.practice_project.tabViews.dogs.DogService.getAllDogs;


public class FosterService {

  private static final int FOSTER_QUANTITY = 10;

  public FosterService() {

    generateFoster();
  }

  public List<Foster> getAllFosters() {

    return generateFoster();
  }

  private List<Foster> generateFoster() {

    List<Foster> fosters = new ArrayList<>();

    for (int i = 0; i < FOSTER_QUANTITY; i++) {
      Foster foster = new Foster(
           UUID.randomUUID()
               .toString(),
           DataFaker.fullName(),
           DataFaker.phoneNumber(),
           getAllDogs()
      );
      fosters.add(foster);
    }

    return fosters;
  }


  //  private List<Dog> generateDogsFostered() {
  //
  //    List<Dog> fosteredDogs = new ArrayList<>();
  //    int totalDogs = new Random().nextInt(1,5);
  //
  //    var repoListDogs = getAllDogs();
  //
  //    for (int i = 0; i < totalDogs; i++) {
  //      Dog dog = repoListDogs.get(i);
  //      fosteredDogs.add(dog);
  //    }
  //
  //    return fosteredDogs;
  //  }
}