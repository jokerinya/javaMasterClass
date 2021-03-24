package com.jokerinya;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        int[] myIntArray = new int[5]; // 5 elements, int Array
//        int[] myIntArray = {0, 1, 2, 3, 4}; // only valid at first initialization
//        myIntArray[4] = 3;
//        for (int i : myIntArray) {
//            System.out.println(i);
//        }
//        double[] myDoubleArray = new double[5];
//
//        System.out.println("int array length " + myIntArray.length);
//
//        printArray(myIntArray);
        int[] myArray = getIntegers(5);
        int total = Arrays.stream(myArray).sum();
        System.out.println((int) (total/5));
        System.out.println("Fonksiyondan " + getAverage(myArray));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer \r");
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            int num = scanner.nextInt();
            array[i] = num;
        }
        return array;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) (sum/array.length);
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element is " + i);
        }
    }
}
