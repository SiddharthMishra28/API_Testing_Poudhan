package com.restassured.composition;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Transmission cvtTransmission = new Transmission("CVT", 6, 650);
        Engine mhakw = new Engine(2200, "Mahindra", "MHawk", cvtTransmission);
        car.setModel("Scorpio");
        car.setEngine(mhakw);

    }
}
