package com.rompware.assessmentsvb;

import com.rompware.assessmentsvb.entities.car.Car;
import com.rompware.assessmentsvb.entities.car.CarRepository;
import com.rompware.assessmentsvb.entities.customer.Customer;
import com.rompware.assessmentsvb.entities.customer.CustomerRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Seeder implements CommandLineRunner {

  private final CustomerRepository customerRepository;
  private final CarRepository carRepository;

  @Override
  public void run(String... args) throws Exception {
    seedCustomers();
    seedCars();
  }

  private void seedCustomers() {
    if (customerRepository.count() > 0) return;
    List<Customer> customersToSeed = List.of(new Customer("Steve"), new Customer("Linda"));
    customerRepository.saveAll(customersToSeed);
  }

  private void seedCars() {
    if (carRepository.count() > 0) return;
    List<Car> carsToSeed =
        List.of(
            new Car("Lexus", "IS220d", "Sport", 4, 5.4, 44285, 28488.66),
            new Car("Renault", "Master", "L2H1 T35 dCi 135 EU6 FWD", 2, 6.4, 48739.98, 30540));
  }
}
