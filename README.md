# SVB Assessment Julian Romp

Lease-a-car API  
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

## Building and Testing

#### Requirements:

* OS: Windows 10/11
* Java 21 SDK or runtime

#### Running:

After cloning the repository open a commandline in the root folder and run the command:  
`./mvnw spring-boot:run`

#### Testing:

Use a program like Postman to send HTTP calls to the API endpoints.  
Endpoints that currently work:

`GET localhost:8080/api/v1/customers/all`  
Gets list of all customers.

`GET localhost:8080/api/v1/cars/all`  
Gets list of all cars.

`POST localhost:8080/api/v1/cars/add`  
Adds a car to the database if you provide a request body with car properties in JSON  
Example:  
{  
"make": "string",  
"model": "string",  
"version": "string",  
"numberOfDoors": int,  
"co2Emission": double,  
"grossPrice": double,  
"nettPrice": double  
}

## Plan of approach

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
