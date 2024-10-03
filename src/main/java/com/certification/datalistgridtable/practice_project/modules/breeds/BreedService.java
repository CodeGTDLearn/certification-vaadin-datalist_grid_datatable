package com.certification.datalistgridtable.practice_project.modules.breeds;

import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
public class BreedService {

  public List<Breed> getBreeds() {

    return BreedRepo.getBreeds();
  }
}