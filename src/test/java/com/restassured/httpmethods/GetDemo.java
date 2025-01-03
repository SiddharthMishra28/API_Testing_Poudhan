package com.restassured.httpmethods;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetDemo {
    public static void main(String[] args) {
//        Headers headers = new Headers();
        RestAssured.baseURI = "https://reqres.in";
        Response response = given().header("", "").when().get("/api/users?page=2")
                .then()
                .statusCode(200).extract().response();
        System.out.println(response.asString());
    }
}
