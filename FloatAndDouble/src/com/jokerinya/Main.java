package com.jokerinya;

public class Main {

    public static void main(String[] args) {
        float myMinFloat = Float.MIN_VALUE;  // 1.4E-45
        float myMaxFloat = Float.MAX_VALUE;  // 3.4028235E38
        System.out.println("Min float = " + myMinFloat);
        System.out.println("Max float = " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;  // 4.9E-324
        double myMaxDouble = Double.MAX_VALUE;  // 1.7976931348623157E308
        System.out.println("Min double = " + myMinDouble);
        System.out.println("Max double = " + myMaxDouble);

        int myInt = 5 / 3;
//        float myFloat = (float) 5.25;
        float myFloatTwo = 5F / 3f;  // This one is better!
        double myDouble = 5d / 3d;
        System.out.println("My Integer = " + myInt);
        System.out.println("My Float = " + myFloatTwo);
        System.out.println("My Double = " + myDouble);

        /*Challenge*/
        double pounds = 5d;
        double kilogram = pounds * 0.45359237d;
        System.out.println("Kilogram " + kilogram);
    }
}
