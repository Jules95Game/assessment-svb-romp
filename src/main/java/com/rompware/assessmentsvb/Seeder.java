package com.rompware.assessmentsvb;

import com.rompware.assessmentsvb.entities.customer.Customer;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Seeder implements CommandLineRunner {

  @Override
  public void run(String... args) throws Exception {
    seedCustomers();
  }

  private void seedCustomers() {
    List<Customer> customersToSeed = new ArrayList<>();
  }
}
