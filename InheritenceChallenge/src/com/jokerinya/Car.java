package com.jokerinya;

public class Car extends Vehicle{

    private String type;
    private int doors;
    private boolean manuelGear;
    private int gearCount;
    private String engineType;

    public Car(String name, int avgSpeed, int enginePower,
               String type, int doors, boolean manuelGear,
               int gearCount,String engineType) {
        super(name, "Road", 4, avgSpeed, enginePower, 1);
        this.type = type;
        this.doors = doors;
        this.manuelGear = manuelGear;
        this.gearCount = gearCount;
        this.engineType = engineType;
    }

    @Override
    public void move() {
        System.out.println("Car.move() " + super.getName() + " is here.");
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isManuelGear() {
        return manuelGear;
    }

    public int getGearCount() {
        return gearCount;
    }

    public String getEngineType() {
        return engineType;
    }
}
