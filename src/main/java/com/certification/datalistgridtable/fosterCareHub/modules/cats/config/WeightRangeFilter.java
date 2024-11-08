package com.certification.datalistgridtable.fosterCareHub.modules.cats.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class WeightRangeFilter {

  private double minWeight;
  private double maxWeight;

  @Override
  public String toString() {

    return String.format("%.1f <-> %.1f", this.minWeight, this.maxWeight);
  }
}