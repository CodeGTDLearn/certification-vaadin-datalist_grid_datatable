package com.certification.datalistgridtable.fosterCareHub.modules.breeds;

import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
public class BreedService {

  public List<Breed> getBreeds() {

    return BreedRepo.getBreeds();
  }
}