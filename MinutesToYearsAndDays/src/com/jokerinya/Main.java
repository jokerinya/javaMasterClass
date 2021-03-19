package com.jokerinya;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printYearsAndDays(527041L);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        } else {
            long newDays = minutes / 1440;
            long newYears = newDays / 365;
            long remainingDays = newDays % 365;
            System.out.println(minutes + " min = " + newYears + " y and " + remainingDays + " d");
        }


    }
}
