package com.cydeo.utils;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public abstract class SpartanTestBase {
    @BeforeAll
    public static void setUp(){
        RestAssured.baseURI=ConfigurationReader.getProperty("spartan.api.url");



    }
}