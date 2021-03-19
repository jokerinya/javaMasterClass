package com.jokerinya;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo){
        int newNumOne = (int) (numOne * 1000);
        int newNumTwo = (int) (numTwo * 1000);
        return newNumOne == newNumTwo ? true : false;
    }
}
