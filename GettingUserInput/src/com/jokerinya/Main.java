package com.jokerinya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2021 - year;
            if (age>=0 && age<=99){
                System.out.println("Your name is " + name + " and you are " + (2021-year) + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Cannot parse the year of birth!");
        }

        scanner.close();
    }
}
