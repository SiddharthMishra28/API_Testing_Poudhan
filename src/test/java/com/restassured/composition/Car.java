package com.restassured.composition;

// IS-A
public class Car {
    private String model;
    private Engine engine; // HAS-A

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car() {
    }

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
