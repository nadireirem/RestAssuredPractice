package com.cydeo.tests.day01_intro;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class Practice3 {
    /*
    Q3:

- Given accept type is Json
- Path param "id" value is 12345
- When user sends request to  https://jsonplaceholder.typicode.com/posts/{id}
- Then status code is 404

- And json body contains "{}"
     */

    String url = "https://jsonplaceholder.typicode.com/posts/{id}";

    @DisplayName("Q3")
    @Test
    public void task3() {
        Response response = (Response) given().accept(ContentType.JSON)
                .and().pathParam("id", 1)
                .when().get(url)
                .then().assertThat().statusCode(404)
                .and().assertThat().body(containsString("{}"));


    }

}