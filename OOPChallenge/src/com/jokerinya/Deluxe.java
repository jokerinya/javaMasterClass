package com.jokerinya;

public class Deluxe extends Basic{
    public Deluxe(String name, String breadRoll, String meat, double basePrice) {
        super(name, breadRoll, meat, basePrice,
                new Addition("Chips", 2),
                new Addition("Drinks", 1.5));
    }
}
