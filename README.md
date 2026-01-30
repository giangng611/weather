# Weather API (Spring Boot)

A lightweight Spring Boot REST API that provides weather-related endpoints and demonstrates secure backend architecture with **JWT authentication**. The API is designed to be tested easily via **Swagger UI** (no frontend required).

## Key Features
- RESTful endpoints for weather data
- JWT-based authentication & authorization
- Swagger UI for interactive API testing and documentation
- Clean separation of concerns (controllers / services / security)

## Tech Stack
- Java + Spring Boot
- Spring Security + JWT
- Swagger/OpenAPI (Swagger UI)
- Maven (or Gradle)

---

## Getting Started

### Prerequisites
- Java (JDK 17+ recommended)
- Maven (or Gradle)

### Clone & Run
```bash
git clone https://github.com/giangng611/weather.git
cd weather
mvn spring-boot:run
