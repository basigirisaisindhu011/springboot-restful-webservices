# Spring Boot RESTful Web Services

A RESTful Web Services application built using Spring Boot that demonstrates industry-standard layered architecture, DTO pattern, exception handling, and CRUD operations for managing users.

## Features

* Create User
* Get User by ID
* Get All Users
* Update User
* Delete User
* DTO Pattern
* Global Exception Handling
* Custom Exceptions
* ModelMapper Integration
* Layered Architecture
* RESTful APIs
* Spring Data JPA

---

## Tech Stack

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* ModelMapper
* Maven
* MySQL (or your configured database)
* Lombok

---

## Project Structure

```text
src/main/java/com/practice/springboot_restful_webservices
│
├── controller
│   └── UserController.java
│
├── dto
│   └── UserDto.java
│
├── entity
│   └── User.java
│
├── exception
│   ├── EmailAlreadyExistsException.java
│   ├── ErrorDetails.java
│   ├── GlobalExceptionHandler.java
│   └── ResourceNotFoundException.java
│
├── mapper
│   └── UserMapper.java
│
├── repository
│   └── UserRepository.java
│
├── service
│   ├── UserService.java
│   └── UserServiceImpl.java
│
└── SpringbootRestfulWebservicesApplication.java
```

---

## Architecture

```text
Client
   |
   v
Controller
   |
   v
Service Layer
   |
   v
Repository Layer
   |
   v
Database
```

---

## API Endpoints

### Create User

```http
POST /api/users
```

Request Body

```json
{
  "firstName": "Sai",
  "lastName": "Sindhu",
  "email": "sai@example.com"
}
```

---

### Get User By ID

```http
GET /api/users/{id}
```

Example

```http
GET /api/users/1
```

---

### Get All Users

```http
GET /api/users
```

---

### Update User

```http
PUT /api/users/{id}
```

Request Body

```json
{
  "firstName": "Updated",
  "lastName": "User",
  "email": "updated@example.com"
}
```

---

### Delete User

```http
DELETE /api/users/{id}
```

---

## Exception Handling

The application uses centralized exception handling through:

* GlobalExceptionHandler
* ResourceNotFoundException
* EmailAlreadyExistsException

Sample Error Response:

```json
{
  "timestamp": "2026-06-14T12:00:00",
  "message": "User not found with id: 1",
  "path": "/api/users/1"
}
```

---

## DTO Pattern

The application uses DTOs to separate API contracts from database entities.

Benefits:

* Improved security
* Better maintainability
* Loose coupling
* Clean API responses

---

## ModelMapper

ModelMapper is used to convert:

```text
User Entity <----> UserDto
```

This reduces boilerplate code and keeps the service layer clean.

---

## Running the Application

### Clone Repository

```bash
git clone https://github.com/basigirisaisindhu011/springboot-restful-webservices.git
```

### Navigate to Project

```bash
cd springboot-restful-webservices
```

### Build Project

```bash
mvn clean install
```

### Run Application

```bash
mvn spring-boot:run
```

Application starts on:

```text
http://localhost:8080
```

---

## Learning Outcomes

This project demonstrates:

* Spring Boot Fundamentals
* REST API Development
* Layered Architecture
* DTO Pattern
* Spring Data JPA
* Repository Pattern
* Exception Handling
* ModelMapper
* Dependency Injection
* CRUD Operations

---

## Future Improvements

* Bean Validation
* Spring Security
* JWT Authentication
* Swagger/OpenAPI Documentation
* Docker Support
* Unit & Integration Testing
* Pagination & Sorting

---

## Author

Sindhu

Built while learning Spring Boot RESTful Web Services and Backend Development.
