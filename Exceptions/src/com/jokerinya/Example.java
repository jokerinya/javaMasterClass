package com.jokerinya;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try{
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("Something went wrong, program closed.");
        }
    }

    public static int divide() {
        int x, y;
        x = getInt();
        y = getInt();
        return x / y;
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
