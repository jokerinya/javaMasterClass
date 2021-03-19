package com.jokerinya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean start = true;
        while (true){
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int number = scanner.nextInt();
                if (start){
                    max = number;
                    min = number;
                    start = false;
                }
                max = Math.max(number, max);
                min = Math.min(number, min);
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = " + min + "|| Max = " + max);



        scanner.close();
    }
}
