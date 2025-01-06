package com.restassured.Assignments_Jan6;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Assignment1_getUser {
    // CREATE and EXECUTE GET, POST, PUT, DELETE for https://jsonplaceholder.typicode.com/

    public static void main(String args[]){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
        Response res = given().when().get("/posts").then().statusCode(200).extract().response();
        System.out.println(res.asString());

    }
}
