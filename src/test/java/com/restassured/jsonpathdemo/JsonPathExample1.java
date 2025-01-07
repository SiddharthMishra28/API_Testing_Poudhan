package com.restassured.jsonpathdemo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.Optional;

public class JsonPathExample1 {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://official-joke-api.appspot.com";
        Response response = RestAssured.given()
                .when()
                .get("/random_joke")
                .then()
                .extract().response();
        String data = response.asString();
        System.out.println(data);
        JsonPath jsonPath = new JsonPath(data);
        String type = jsonPath.get("type");
        System.out.println(type);
    }
}
