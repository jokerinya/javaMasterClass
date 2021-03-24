package com.jokerinya;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        SortedArray sa = new SortedArray();
//        int[] array = sa.getIntegers(5);
//        sa.printArray(array);

        int[] a = {1,2,3,4,5};
//        int[] b = a;
        int[] b = Arrays.copyOf(a, a.length);
        b[0] = 0;
        b[1] = 1000;
        for (int i = 0; i < 5; i++) {
            System.out.println("a = "+ a[i]+ "  --- b = " + b[i]);
        }
    }
}

