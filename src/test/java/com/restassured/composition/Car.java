package com.restassured.composition;

// IS-A
public class Car extends Vehicle {
    private String model;
    private Engine engine; // HAS-A

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
