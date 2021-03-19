package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ford myCar = new Ford("Mustang", 200, 3000, "Sport",
                4, true, 6, "Diesel", "XLS", 320.00d);


        myCar.move();

        Car aCar = new Car("A Car", 100, 1500, "Hatchback",
                4, false, 5, "LPG");

        aCar.move();

        Vehicle vehicle = new Vehicle("Boat", "Seaway", 0,
                45, 5000,2);
        vehicle.move();

        Vehicle emptyVehicle = new Vehicle();
        System.out.println("without parameters start of a  " + emptyVehicle.getName());


        System.out.println("================================================================================");
        Ford emptyFord = new Ford();
        System.out.println("ford empty "+ emptyFord.getName() + " and MAX Speed is " + emptyFord.getMaxSpeed());
    }
}
