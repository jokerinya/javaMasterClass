package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(sumFirstAndLastDigit(1));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number<0) return -1;
        int firstDigit = number % 10;
        int lastDigit = number % 10;  // assume number is one digit
        while (number>=10){  // number is not one digit means bigger or equal to 10
            lastDigit = number/10;
            number /= 10;
        }
        return lastDigit+firstDigit;
    }
}
