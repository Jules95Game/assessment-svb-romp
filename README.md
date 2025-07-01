# SVB Assessment Julian Romp

Java version: 21.0.7 (the latest LTS)  
Spring Boot (with Maven) version: 3.5.3  
Spring Dependencies:

* Spring Web  
  to make REST controllers
* Spring Data JPA  
  to interpret java methods as SQL
* H2 Database  
  for an in-memory database
* Lombok  
  to reduce repetitive code

### 1. Make Tracer-bullet

Goal:  
"localhost:8080/api/v1/customers/all" should return list of 2 customers

* Customer entity (id, name)
* Customer repository
* Customer seeder (2 customers)
* Customer controller (1 endpoint: getAllCustomers)

### 1. Make full car entity

Goal:  
"localhost:8080/api/v1/cars/all" should return list of 2 cars with all properties

* Car entity  
  (id, make, model, version, doors, CO2 emission, gross price, net price)
* Car repository
* Car seeder (2 cars with all properties)
* Car controller (1 endpoint: getAllCars)
