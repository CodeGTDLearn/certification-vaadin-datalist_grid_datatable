package com.certification.datalistgridtable.practice_project.modules.fosters;

import com.certification.datalistgridtable.practice_project.modules.dogs.Dog;
import com.certification.datalistgridtable.practice_project.modules.dogs.DogRepo;
import com.certification.datalistgridtable.practice_project.utils.DataFaker;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class FosterRepo {

  private static final int FOSTER_QUANTITY = 7;


  public static List<Foster> getAllFosters() {

    List<Foster> fosters = new ArrayList<>();

    for (int i = 0; i < FOSTER_QUANTITY; i++) {

      final List<Dog> allDogs = DogRepo.getAllDogs();

      Foster foster = new Foster(
           UUID.randomUUID()
               .toString(),
           DataFaker.fullName(),
           DataFaker.phoneNumber(),
           allDogs
      );
      fosters.add(foster);
    }

    return fosters;
  }
}