package com.restassured.composition;

public class Engine {
    private int maxCapacityInCc;
    private String make;
    private String model;
    private Transmission transmission; // HAS-A relationship

    public Engine(int maxCapacityInCc, String make, String model, Transmission transmission) {
        this.maxCapacityInCc = maxCapacityInCc;
        this.make = make;
        this.model = model;
        this.transmission = transmission;
    }

    public Engine() {
    }

    public int getMaxCapacityInCc() {
        return maxCapacityInCc;
    }

    public void setMaxCapacityInCc(int maxCapacityInCc) {
        this.maxCapacityInCc = maxCapacityInCc;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
