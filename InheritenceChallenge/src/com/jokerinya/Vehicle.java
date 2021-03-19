package com.jokerinya;

public class Vehicle {

    private String name;
    private String how;
    private int tyresNumber;
    private int avgSpeed;
    private int enginePower;
    private int driverNumber;

    public Vehicle(){
        this("Unknown", "unknown", -1, -1, -1, -1);
    }

    public Vehicle(String name, String how, int tyresNumber, int avgSpeed, int enginePower, int driverNumber) {
        this.name = name;
        this.how = how;
        this.tyresNumber = tyresNumber;
        this.avgSpeed = avgSpeed;
        this.enginePower = enginePower;
        this.driverNumber = driverNumber;
    }

    public void move(){
        System.out.println("Vehicle.move(), vehicle goes with AVG " + this.avgSpeed);
    }


    public String getName() {
        return name;
    }

    public String getHow() {
        return how;
    }

    public int getTyresNumber() {
        return tyresNumber;
    }

    public int getAvgSpeed() {
        return avgSpeed;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public int getDriverNumber() {
        return driverNumber;
    }
}
