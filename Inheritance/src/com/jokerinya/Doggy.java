package com.jokerinya;

public class Doggy {
    private static String name;

    public Doggy(String name) {
        Doggy.name = name;
    }

    public void doggyName(){
        System.out.println("Doggy name is  " + name);
    }
}
