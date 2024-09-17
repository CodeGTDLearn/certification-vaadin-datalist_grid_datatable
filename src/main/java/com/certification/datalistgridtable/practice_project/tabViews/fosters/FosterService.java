package com.certification.datalistgridtable.practice_project.tabViews.fosters;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class FosterService {

  public List<Foster> getAllFosters() {

    return FosterDAO.getAllFosters();
  }
}