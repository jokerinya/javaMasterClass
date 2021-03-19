package com.jokerinya;

public class TeenNumberChecker {
    public static boolean isTeen(int num){
        return (num<=19 && num>=13) ? true : false;
    }
    public static boolean hasTeen(int numOne, int numTwo, int numThree){
        return isTeen(numOne) || isTeen(numTwo) || isTeen(numThree);
    }
}
