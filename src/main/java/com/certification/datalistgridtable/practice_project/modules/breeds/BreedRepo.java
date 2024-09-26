package com.certification.datalistgridtable.practice_project.modules.breeds;

import com.certification.datalistgridtable.practice_project.utils.DataFaker;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BreedRepo {

  public static List<Breed> getBreeds() {

    var totalBreeds = 20;
    
    List<Breed> breeds = new ArrayList<>();

    for (int i = 0; i < totalBreeds; i++) {
      breeds.add(new Breed(
           UUID.randomUUID().toString(),
           DataFaker.dogBreed(),
           DataFaker.city(),
           DataFaker.behavior(),
           DataFaker.dogName(),
           DataFaker.imageDog()
      ));
    }

    return breeds;
  }
}