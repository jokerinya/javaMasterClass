package com.jokerinya;
class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Mitsubishi extends Car {
    public Mitsubishi() {
        super("Mitsubishi", 4);
    }
    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }
    @Override
    public String accelerate(){
        return "Mitsubishi -> accelerate()";
    }
    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

class Holden extends Car {
    public Holden() {
        super("Holden", 4);
    }
    @Override
    public String startEngine() {
        return  getClass().getSimpleName() + " -> startEngine()";
    }
    @Override
    public String accelerate(){
        return  getClass().getSimpleName() + " -> accelerate()";
    }
    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Ford extends Car {
    public Ford() {
        super("Ford", 4);
    }
    @Override
    public String startEngine() {
        return  getClass().getSimpleName() + " -> startEngine()";
    }
    @Override
    public String accelerate(){
        return  getClass().getSimpleName() + " -> accelerate()";
    }
    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here



        for (int i = 1; i < 6; i++) {
            Car randomCar = randomCar();
            System.out.println("Car #" + i + "\n" + randomCar.accelerate() + "\n"
                                + randomCar.startEngine() + "\n");

        }

    }

    public static Car randomCar(){
        int random = (int) (Math.random() * 3) +1;
        switch (random){
            case 1:
                return new Mitsubishi();

            case 2:
                return new Holden();
            case 3:
                return new Ford();
        }
        return null;
    }
}





















