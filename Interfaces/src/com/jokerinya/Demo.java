package com.jokerinya;

public class Demo implements IFirstInterface, ISecondInterface{
    private String name;

    public Demo(String name) {
        this.name = name;
    }

    @Override
    public void write() {
        System.out.println("Hello " + this.name);
    }
    @Override
    public void writeTwice() {
        System.out.println("Hello " + this.name);
        System.out.println("Hello " + this.name);
    }

    public String getName() {
        return name;
    }
}
