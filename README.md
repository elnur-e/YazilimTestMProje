# REST Assured API Test Project

This project is an automated API testing project developed using Java, Maven, JUnit4 and REST Assured.

## Technologies
- Java
- Maven
- JUnit 4
- REST Assured

## Test Scenarios
- GET request test with:
    - Status code validation
    - Response body validation
    - Response time validation

- POST request test with JSON request body including:
    - Status code validation
    - Response body validation
    - Response time validation
  

## Logging & Performance Threshold
- All requests and responses are logged using REST Assured `.log().all()`.
- Response time is measured and must be under `MAX_RESPONSE_TIME` (e.g., 3000 ms).
- Tests print a clear PASS/FAIL message to the console.


## How to Run Tests

```bash
mvn test
