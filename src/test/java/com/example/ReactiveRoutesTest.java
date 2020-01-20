package com.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class ReactiveRoutesTest {

    @Test
    void bodyAlreadyRead() {
        given()
                .when()
                .auth().preemptive().basic("admin", "test")
                .get("/test")
                .then()
                .statusCode(200)
                .body(is("reactive"));
    }
}
