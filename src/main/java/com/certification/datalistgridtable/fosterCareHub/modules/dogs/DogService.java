package com.certification.datalistgridtable.fosterCareHub.modules.dogs;

import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
public class DogService {

  public List<Dog> getAllDogs() {

    return DogRepo.getAllDogs();
  }

}