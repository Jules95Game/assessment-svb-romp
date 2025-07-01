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
"GET localhost:8080/api/v1/customers/all" should return list of 2 customers

* Customer entity (id, name)
* Customer repository
* Customer seeder (2 customers)
* Customer controller (1 endpoint: getAllCustomers)

### 2. Make full car entity

Goal:  
"GET localhost:8080/api/v1/cars/all" should return list of 2 cars with all properties

* Car entity  
  (id, make, model, version, doors, CO2 emission, gross price, net price)
* Car repository
* Car seeder (2 cars with all properties)
* Car controller (1 endpoint: getAllCars)

### 3. Add a car to the list

Goal:  
"POST localhost:8080/api/v1/cars/add"  
with a request body in JSON like:

{  
"make": "Lexus",  
"model": "IS220d",  
"version": "Sport",  
"numberOfDoors": 4,  
"co2Emission": 5.4,  
"grossPrice": 44285.0,  
"nettPrice": 28488.66  
}

should add a car with those properties to the list

* CarController PostMapping
* Get @RequestBody as Car
* Save Car to Repository
