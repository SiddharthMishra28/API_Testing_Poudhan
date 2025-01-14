package com.restassured.composition;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Car car = new Car();
        Transmission cvtTransmission = new Transmission("CVT", 6, 650);
        Engine mhakw = new Engine(2200, "Mahindra", "MHawk", cvtTransmission);
        car.setModel("Scorpio");
        car.setEngine(mhakw);
        String jsonData = new com.restassured.serialization.Main().convertToJson(car);
        System.out.println(jsonData);
    }
}
