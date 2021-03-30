package com.jokerinya;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat.");
    }

    public void cantReach(){
        System.out.println("Only Dog type can reach this.");
    }
}
