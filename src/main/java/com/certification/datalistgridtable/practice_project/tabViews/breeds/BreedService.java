package com.certification.datalistgridtable.practice_project.tabViews.breeds;

import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
public class BreedService {

  public List<Breed> getBreeds() {

    return BreedDAO.getBreeds();
  }
}