package com.rompware.assessmentsvb.entities.customer;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

  private final CustomerRepository customerRepository;

  @GetMapping("/all")
  public List<Customer> getAllCustomers() {
    return customerRepository.findAll();
  }
}
