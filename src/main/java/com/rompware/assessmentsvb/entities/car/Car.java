package com.rompware.assessmentsvb.entities.car;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
public class Car {

  @Id @GeneratedValue private UUID id;

  @Setter private String make;
  @Setter private String model;
  @Setter private String version;
  @Setter private int numberOfDoors;
  @Setter private double co2Emission;
  @Setter private double grossPrice;
  @Setter private double nettPrice;

  public Car(
      String make,
      String model,
      String version,
      int numberOfDoors,
      double co2Emission,
      double grossPrice,
      double nettPrice) {
    this.make = make;
    this.model = model;
    this.version = version;
    this.numberOfDoors = numberOfDoors;
    this.co2Emission = co2Emission;
    this.grossPrice = grossPrice;
    this.nettPrice = nettPrice;
  }
}
