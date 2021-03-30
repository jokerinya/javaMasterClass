package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Dog("Hi");
        animal.breathe();
        animal.eat();
//        anima.cantReach(); Throws error
        Dog dog = new Dog("Hello");
        dog.breathe();
        dog.eat();
        dog.cantReach();

        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
