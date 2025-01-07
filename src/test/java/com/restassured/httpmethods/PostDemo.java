package com.restassured.httpmethods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostDemo {
    // REST -
    // user
    // [1, sid]
    // address
    // [1, office address, 1]
    // [2, home address, 1]
    // email
    // [1, sid@test.com, 1]
    // {
    //   "id" : 1,
    //   "name" : "sid",
    //    address: [
    //        {
    //           "addressId" : 1,
    //           "address" : "home address"
    //           "id" : 1
    //        },
    //        {...}
    //    ],
    //    "email" : {
    //         "id" : 1
    //         "email" : "sid@test.com"
    //         "id" : 1
    //    }
    // }
    public static void main(String[] args) {
        String payLoad = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        RestAssured.baseURI = "https://reqres.in/";
        Response response = given().contentType(ContentType.JSON)
                .body(payLoad)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .extract()
                .response();
        System.out.println(response.asString());
    }

}
