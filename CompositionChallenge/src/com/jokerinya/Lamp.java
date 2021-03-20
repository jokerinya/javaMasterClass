package com.jokerinya;

public class Lamp {
    private String type;
    private boolean battery;
    private int globRating;

    public Lamp(String type, boolean battery, int globRating) {
        this.type = type;
        this.battery = battery;
        this.globRating = globRating;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public String getType() {
        return type;
    }

    public void turnOn () {
        System.out.println("Lamp -> Turning on");
    }
}
