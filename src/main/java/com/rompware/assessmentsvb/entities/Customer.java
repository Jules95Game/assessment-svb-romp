package com.rompware.assessmentsvb.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class Customer {
  @Id @GeneratedValue private UUID id;

  private String name;
}
