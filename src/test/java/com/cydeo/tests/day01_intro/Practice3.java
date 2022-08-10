package com.cydeo.tests.day01_intro;

import com.cydeo.utils.SpartanTestBase;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class Practice3 {
    /*
    Q3:

- Given accept type is Json
- Path param "id" value is 12345
- When user sends request to  https://jsonplaceholder.typicode.com/posts/{id}
- Then status code is 404

- And json body contains "{}"
     */


String url=" https://jsonplaceholder.typicode.com/posts/{id}";
    @DisplayName("Q3")
    @Test
    public void task3() {
        Response response = given().accept(ContentType.JSON)
                .and().pathParam("id", 12345)
                .when().get("url");

        assertEquals(404, response.statusCode());
        assertTrue(response.asString().contains("{}") , "{}");
    }

        @DisplayName("Q4")
@Test
        public void task4(){
//            - Given accept type is Json
            //            - Path param "id" value is 2
            //            - When user sends request to  https://jsonplaceholder.typicode.com/posts/{id}/comments
            Response response = given().accept(ContentType.JSON)
                    .and().pathParam("id", 2)
                    .when().get("/spartans/{id}");


//            - Then status code is 200
//            - And header Content - Type is Json
//            - And json body contains "Presley.Mueller@myrl.com",  "Dallas@ole.me" , "Mallory_Kunze@marie.org"



        }

    }

