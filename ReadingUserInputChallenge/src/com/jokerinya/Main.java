package com.jokerinya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        while (counter<=10){
            System.out.println("Enter number #" + counter);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int number = scanner.nextInt();
                scanner.nextLine();
                sum += number;
                counter++;
            } else {
                System.out.println("Invalid value please re-enter number #" + counter);
                scanner.nextLine(); // handle end of line Enter key
            }
        }
        System.out.println("Your total number is " + sum);



        scanner.close();
    }
}
