package com.jokerinya;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[] {1,2,3,4};
        System.out.println("Array "+ Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed Array "+ Arrays.toString(array));

    }
    private static void reverse(int[] array){
        int maxIndex = array.length - 1;
        int halfwayIndex = maxIndex / 2;
        for (int i = 0; i < halfwayIndex; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }
}
