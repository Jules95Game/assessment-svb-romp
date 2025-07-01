package com.rompware.assessmentsvb.entities.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
public class Customer {

  @Id @GeneratedValue private UUID id;

  @Setter private String name;

  public Customer(String name) {
    this.name = name;
  }
}
