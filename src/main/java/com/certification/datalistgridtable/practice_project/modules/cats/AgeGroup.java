package com.certification.datalistgridtable.practice_project.modules.cats;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
public class AgeGroup {

  private int minAge;
  private int maxAge;

  @Override
  public String toString() {

     return "%s <-> %d".formatted(this.minAge, this.maxAge);
  }
}