package com.jokerinya;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int x = 98;
//        int y = 0;
//        System.out.println(divideLBYL(x,y));
//        System.out.println(divideEAFP(x,y));
        int x = getIntEAFP();
        System.out.println("x is " + x);
    }

    private static int getX(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getIntEAFP(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an Ingeter number: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e){
            return 0;
        }
    }

    private static int getIntLBYL(){
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an Ingeter number: ");
        String entry = scanner.next();
        for (int i = 0; i < entry.length(); i++) {
            if (!Character.isDigit(entry.charAt(i))){
                isValid = false;
                break;
            }
        }
        if (isValid){
            return Integer.parseInt(entry);
        }
        return 0;
    }

    private static int divideLBYL(int x, int y){
        if (y != 0){
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try {
            return x / y;
        } catch (ArithmeticException e){
            return 0;
        }
    }
}
