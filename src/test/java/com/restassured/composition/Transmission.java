package com.restassured.composition;

public class Transmission {
    private String type;
    private int numGears;
    private int maxTorque;

    public Transmission(String type, int numGears, int maxTorque) {
        this.type = type;
        this.numGears = numGears;
        this.maxTorque = maxTorque;
    }

    public Transmission() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    public int getMaxTorque() {
        return maxTorque;
    }

    public void setMaxTorque(int maxTorque) {
        this.maxTorque = maxTorque;
    }
}
