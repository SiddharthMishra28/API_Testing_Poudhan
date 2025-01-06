package com.restassured.Assignments_Jan6;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetSingleUser {
    public static void main(String args[]) {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
        Response res = given().when().get("/posts/1").then().statusCode(200).extract().response();
        System.out.println(res.asString());
    }
}
