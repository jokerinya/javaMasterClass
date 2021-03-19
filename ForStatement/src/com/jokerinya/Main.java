package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println();
//        for(init; termination; increment){}
        for (int i = 8 ; i > 1; i--) {
            System.out.println("10.000 at "+ i +"% interest = " +
                    String.format("%.2f",calculateInterest(10000, i)));
        }

        int counter = 0;
        for (int i = 3; i < 10; i++) {
            if (counter == 3) break;
            if (isPrime(i)){
                System.out.println(i);
                counter++;
            }
        }
        System.out.println(isPrime(9971));

    }
    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate/100);
    }

    /*Challenge*/
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for (int i = 2; i<=(long) Math.sqrt(n) ; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
