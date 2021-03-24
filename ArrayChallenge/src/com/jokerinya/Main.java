package com.jokerinya;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter how many numbers you want to add to the Array?");
        int numberOfIntegers = scanner.nextInt();
        int[] array = getIntegers(numberOfIntegers);
        printArray(sortIntegers(array));

    }
    public static int[] getIntegers (int num) {
        System.out.println("Enter " + num + " integer \r");
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int[] sortIntegers(int[] array){
        int bigger;
        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[j]>array[i]){
                    bigger = array[j];
                    array[j] = array[i];
                    array[i] = bigger;
                }
            }
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i : array) {
            System.out.println(i);
        }
    }
}
