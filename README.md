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
* Customer controller
