# 🔐 jwt-auth-api

A REST API for user authentication and authorization using JWT (JSON Web Tokens) with Spring Boot and Spring Security.

## 🚀 Features

* User registration (`POST /auth/register`)
* User authentication (`POST /auth/login`)
* JWT token generation and validation
* Protected endpoints (`GET /users`)
* Password hashing (BCrypt)
* In-memory H2 database for development and testing
* Swagger/OpenAPI documentation for easy API exploration

## 🛠️ Technologies

* Java 17
* Spring Boot 3.x
* Spring Security
* Spring Data JPA
* JWT (JJWT library)
* H2 Database
* Lombok
* Springdoc OpenAPI

## 📦 How to run

```bash
./mvnw spring-boot:run
```

Or run the `JwtAuthApiApplication` main class directly from your IDE.

Access the following URLs after starting the application:

* Swagger UI: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
* H2 Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

---

✨ *Thank you for visiting this project!*
****