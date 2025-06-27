package com.rompware.assessmentsvb;

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

  @Override
  public void run(String... args) throws Exception {
    seedCustomers();
  }

  private void seedCustomers() {
    if (customerRepository.count() > 0) return;
    List<Customer> customersToSeed = List.of(new Customer("Steve"), new Customer("Linda"));
    customerRepository.saveAll(customersToSeed);
  }
}
