package com.certification.datalistgridtable.practice_project.tabViews.dogs;

import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
public class DogService {

  public List<Dog> getAllDogs() {

    return DogDAO.getAllDogs();
  }
}