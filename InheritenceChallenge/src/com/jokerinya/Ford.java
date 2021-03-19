package com.jokerinya;

public class Ford extends Car{

    private String model;
    private double maxSpeed;

    public Ford(){
        this("A Ford Model", 200, -1,
                "Unknown", -1, true, 5, "Fuel",
                "A Ford", 320);
    }

    public Ford(String name, int avgSpeed, int enginePower, String type,
                int doors, boolean manuelGear, int gearCount, String engineType,
                String model, double maxSpeed) {
        super(name, avgSpeed, enginePower, type, doors, manuelGear, gearCount, engineType);
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    private void fastMove(){
        System.out.println("Ford " + super.getName() + " goes with " + this.maxSpeed);
        System.out.println("Your cars name is " + super.getName());
    }

    @Override
    public void move() {
        fastMove();
        System.out.println("Calling of super.move on Ford, lets see which one will be come.");
        super.move();
    }

    public String getModel() {
        return model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}
