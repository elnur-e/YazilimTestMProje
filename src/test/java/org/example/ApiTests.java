package org.example;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class ApiTests {

    private static final long MAX_RESPONSE_TIME = 3000; // 3 saniye

    @Test
    public void get_shouldReturn200_andFastEnough() {

        System.out.println("----- GET TEST STARTED -----");

        long startTime = System.currentTimeMillis();

        var response =
                given().log().all()
                        .when()
                        .get("https://httpbin.org/get")
                        .then()
                        .log().all()
                        .statusCode(200)
                        .body("url", equalTo("https://httpbin.org/get"))
                        .extract().response();

        long responseTime = System.currentTimeMillis() - startTime;

        System.out.println("GET Response Time: " + responseTime + " ms");

        if (responseTime <= MAX_RESPONSE_TIME)
            System.out.println("GET Performance Test: PASSED");
        else
            System.out.println("GET Performance Test: FAILED");

        assertThat("GET response time is too slow!", responseTime, lessThan(MAX_RESPONSE_TIME));
    }

    @Test
    public void post_shouldReturn200_andFastEnough() {

        System.out.println("----- POST TEST STARTED -----");

        String requestBody = """
        {
          "name": "Elnur",
          "job": "Tester"
        }
        """;

        long startTime = System.currentTimeMillis();

        var response =
                given().log().all()
                        .contentType("application/json")
                        .body(requestBody)
                        .when()
                        .post("https://httpbin.org/post")
                        .then()
                        .log().all()
                        .statusCode(200)
                        .body("json.name", equalTo("Elnur"))
                        .body("json.job", equalTo("Tester"))
                        .extract().response();

        long responseTime = System.currentTimeMillis() - startTime;

        System.out.println("POST Response Time: " + responseTime + " ms");

        if (responseTime <= MAX_RESPONSE_TIME)
            System.out.println("POST Performance Test: PASSED");
        else
            System.out.println("POST Performance Test: FAILED");

        assertThat("POST response time is too slow!", responseTime, lessThan(MAX_RESPONSE_TIME));
    }
}
