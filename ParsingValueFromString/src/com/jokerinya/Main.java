package com.jokerinya;

import java.lang.reflect.Type;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "2018.56";
        double number = Double.parseDouble(numberAsString);
        System.out.println("numberAsString = " + numberAsString);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);

        numberAsString = numberAsString + 1 + "2";
        System.out.println("numberAsString = " + numberAsString);
    }
}
