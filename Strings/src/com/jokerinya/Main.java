package com.jokerinya;

public class Main {

    public static void main(String[] args) {
        String myString = "This is my String";
        System.out.println("Output = " + myString);
        myString = myString + " and some more.";
        System.out.println("Output = " + myString);
        myString = myString + "\u00A9 2021";
        System.out.println("Output = " + myString);
        /*A different thing*/
        String myNumString = "200.05";
        String myNumString2 = "0.95";
        System.out.println(myNumString + myNumString2);
        /*Another concept*/
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("last string "+ lastString);

    }
}
