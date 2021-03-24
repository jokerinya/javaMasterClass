package com.jokerinya;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static Scanner scanner = new Scanner(System.in);

    int[] array = getIntegers(5);


    public static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int temp;
        for (int a = 0; a < sortedArray.length; a++) {
            for (int b = a+1; b < sortedArray.length; b++) {
                if (sortedArray[b]>sortedArray[a]) {
                    temp = sortedArray[b];
                    sortedArray[b] = sortedArray[a];
                    sortedArray[a] = temp;
                }
            }
        }
        return sortedArray;
    }



    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
