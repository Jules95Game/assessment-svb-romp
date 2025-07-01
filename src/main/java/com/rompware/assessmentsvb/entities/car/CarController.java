package com.rompware.assessmentsvb.entities.car;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/cars")
public class CarController {

  private final CarRepository carRepository;

  @GetMapping("/all")
  public List<Car> getAllCars() {
    return carRepository.findAll();
  }
}
