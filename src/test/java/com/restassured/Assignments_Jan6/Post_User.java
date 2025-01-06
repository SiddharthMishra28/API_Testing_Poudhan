package com.restassured.Assignments_Jan6;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Post_User {
    public static void main(String args[]){

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
        Response res = given().contentType(ContentType.JSON).body("{\n" +
                "  \"userId\": 101,\n" +
                "  \"id\": 101,\n" +
                "  \"title\": \"Poudhan aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
                "  \"body\": \"Poudhan et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
                "}").when().post("/posts").then().statusCode(201).extract().response();

        System.out.println(res.asString());

    }
}
