package com.certification.datalistgridtable.practice_project.modules.fosters;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class FosterService {

  private static List<Foster> fosters;

  public List<Foster> getAllFosters() {

    fosters = FosterRepo.getAllFosters();

    return fosters;
  }

  public int totalize_DogsFostered() {

    return
         fosters.stream()
                .mapToInt(
                     foster -> foster.getDogsFostered()
                                     .size())
                .sum();
  }

  public long totalize_FostersWithMultipleDogs() {

    return
         fosters.stream()
                .filter(foster -> foster.getDogsFostered()
                                        .size() > 1)
                .count();
  }
}