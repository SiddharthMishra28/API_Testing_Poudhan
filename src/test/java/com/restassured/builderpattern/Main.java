package com.restassured.builderpattern;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setMake("BMW");
        bmw.setModel("i8");
    // BUILDER PATTERN!
        bmw.setMake("BMW").setModel("i8").setEngineCapacity(3000);
    }
}
