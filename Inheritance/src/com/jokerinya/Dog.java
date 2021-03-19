package com.jokerinya;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() has been called.");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() has been called.");
        chew();
        super.eat();   // @Override with this can be override the methods.
    }

    public void walk(){
        System.out.println("Dog.walk() has been called.");
        super.move(5);
    }
    public void run(){
        System.out.println("Dog.run() has been called.");
        move(15);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called.");
        moveLegs(speed);
        super.move(speed);
    }
}
