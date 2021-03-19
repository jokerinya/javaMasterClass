package com.jokerinya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        long avg = 0;
        int counter = 0;
        while (true){
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int number = scanner.nextInt();
                sum += number;
                counter++;
                avg = Math.round((double) sum/counter);
                System.out.println("sum =" + sum + ", counter = " + counter);
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = "+ sum + " AVG = " + avg);

        scanner.close();
    }
}
