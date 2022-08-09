package com.cydeo.tests.day01_intro;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class Practice1 {
    /*
    - Given accept type is Json
- When user sends request to https://jsonplaceholder.typicode.com/posts
-Then print response body
- And status code is 200
- And Content - Type is Json
     */


    String url ="https://jsonplaceholder.typicode.com/posts";

    @DisplayName("Q1")
    @Test
    public void printResponseBody(){

       Response response = given().accept(ContentType.JSON)
             .when().get(url);
      response.prettyPrint();
        response.then()
                .statusCode(200)
                .contentType(ContentType.JSON);




    }


}
