package com.jokerinya;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter how many number you want to enter: ");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        int min = findMin(array);
        System.out.println("Your minimum value is: " + min);


        scanner.close();
    }


    private static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter #" + i + " number:" );
            array[i]= scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

}
