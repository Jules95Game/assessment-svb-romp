package com.rompware.assessmentsvb.entities.car;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/cars")
public class CarController {

  private final CarRepository carRepository;

  @GetMapping("/all")
  public List<Car> getAllCars() {
    return carRepository.findAll();
  }

  @PostMapping("/add")
  public ResponseEntity<Car> createCar(@RequestBody Car newCar) {
    Car savedCar = carRepository.save(newCar);
    return ResponseEntity.ok(savedCar);
  }
}
