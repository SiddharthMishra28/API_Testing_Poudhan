package com.restassured.httpmethods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Post_Registration {

    public static void main(String args[]){
        RestAssured.baseURI = "https://reqres.in";
        String payload = "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"pistol\"\n" +
                "}";

        Response res = given().contentType(ContentType.JSON).body(payload).when().post("/api/register").then().statusCode(200).extract().response();

        System.out.println(res.asString());
    }
}
