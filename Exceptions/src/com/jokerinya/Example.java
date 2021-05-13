package com.jokerinya;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    public static int divide() {
        int x, y;
        try {
            x = getInt();
            y = getInt();
        } catch (NoSuchElementException e ){
            throw new ArithmeticException("No suitable input");
        }

        try {
            return x / y;
        } catch (ArithmeticException e){
            throw new ArithmeticException("Attempt to divide to zero");
        }
    }

    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        while (true){
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("Please enter a valid value.");
            }
        }
    }
}
