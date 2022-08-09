package com.cydeo.tests.day01_intro;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
public class Practice2 {
    /*
    - Given accept type is Json
- Path param "id" value is 1
- When user sends request to  https://jsonplaceholder.typicode.com/posts/{id}
- Then status code is 200

-And json body contains "repellat provident"
- And header Content - Type is Json
- And header "X-Powered-By" value is "Express"
- And header "X-Ratelimit-Limit" value is 1000
- And header "Age" value is more than 100

- And header "NEL" value contains "success_fraction"
     */
    String url ="https://jsonplaceholder.typicode.com/posts";

    @DisplayName("Q2")
    @Test
    public void getJsonPlaceholderSuccessHeaders() {
        given().accept(ContentType.JSON)
                .and().pathParam("id", 1)
                .when().get(url+"/{id}")
                .then().assertThat().statusCode(HttpStatus.SC_OK)
                .and().assertThat().body(containsString("repellat provident"))
                .and().assertThat().contentType(ContentType.JSON)
                .and().assertThat().header("X-Powered-By","Express")
                .and().assertThat().header("X-Ratelimit-Limit","1000")
                .and().assertThat().header("age", greaterThan("100"))
                .and().assertThat().header("NEL",containsString("success_fraction"));

    }
}
