package com.certification.datalistgridtable.fosterCareHub.modules.fosters;

import com.certification.datalistgridtable.fosterCareHub.modules.dogs.DogRepo;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static com.certification.datalistgridtable.fosterCareHub.utils.DataBuilders.createFoster;

@AllArgsConstructor
public class FosterRepo {

  private static final int TOTAL_FOSTERS = 7;

  public static List<Foster> getAllFosters() {

    List<Foster> fosters = new ArrayList<>();

    for (int i = 0; i < TOTAL_FOSTERS; i++) {
      var allDogs = DogRepo.getAllDogs();
      fosters.add(createFoster(allDogs));
    }

    return fosters;
  }

}