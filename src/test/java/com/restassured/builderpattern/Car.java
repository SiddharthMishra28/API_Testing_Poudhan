package com.restassured.builderpattern;

public class Car {
    private String make;
    private String model;
    private int engineCapacity;

    public Car(){}

    public Car(String make, String model, int engineCapacity) {
        this.make = make;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    public String getMake() {
        return make;
    }

    public Car setMake(String make) {
        this.make = make;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public Car setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
        return this;
    }
}
