package com.certification.datalistgridtable.practice_project.tabViews.fosters;

import com.certification.datalistgridtable.practice_project.tabViews.dogs.Dog;
import com.certification.datalistgridtable.practice_project.tabViews.dogs.DogDAO;
import com.certification.datalistgridtable.practice_project.utils.DataFaker;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class FosterDAO {

  private static final int FOSTER_QUANTITY = 7;


  public static List<Foster> getAllFosters() {

    List<Foster> fosters = new ArrayList<>();

    for (int i = 0; i < FOSTER_QUANTITY; i++) {

      final List<Dog> allDogs = DogDAO.getAllDogs();

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