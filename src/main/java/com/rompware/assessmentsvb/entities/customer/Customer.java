package com.rompware.assessmentsvb.entities.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@RequiredArgsConstructor
public class Customer {
  @Id @GeneratedValue private UUID id;

  @Setter private String name;
}
