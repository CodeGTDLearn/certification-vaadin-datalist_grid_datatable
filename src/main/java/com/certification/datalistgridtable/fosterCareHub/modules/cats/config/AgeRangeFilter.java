package com.certification.datalistgridtable.fosterCareHub.modules.cats.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AgeRangeFilter {

  private int minAge;
  private int maxAge;

  @Override
  public String toString() {

     return "%s <-> %d".formatted(this.minAge, this.maxAge);
  }
}