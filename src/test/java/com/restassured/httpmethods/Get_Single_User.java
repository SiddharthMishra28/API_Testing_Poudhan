package com.restassured.httpmethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class Get_Single_User {
    public static void main(String args[]){

        RestAssured.baseURI = "https://reqres.in/";
        Response res = given().when().get("api/users/2").then().statusCode(200).extract().response();
        System.out.println(res.asString());

    }
}
