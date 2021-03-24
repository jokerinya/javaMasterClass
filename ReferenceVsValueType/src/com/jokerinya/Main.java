package com.jokerinya;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 10;
        int anothoerIntValue = myIntValue;
        System.out.println("myIntValue " + myIntValue );
        System.out.println("anothoerIntValue " + anothoerIntValue );
        anothoerIntValue++;
        System.out.println("myIntValue " + myIntValue );
        System.out.println("anothoerIntValue " + anothoerIntValue );

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("My Int Array " + Arrays.toString(myIntArray));
        System.out.println("Another Array " + Arrays.toString(anotherArray));
        anotherArray[0] = 1;
        System.out.println("(After Change)My Int Array " + Arrays.toString(myIntArray));
        System.out.println("(After Change)Another Array " + Arrays.toString(anotherArray));
        anotherArray = new int[] {5, 4, 3, 2, 1};
        modifyArray(myIntArray);
        System.out.println("(After Modify)My Int Array " + Arrays.toString(myIntArray));
        System.out.println("(After Modify)Another Array " + Arrays.toString(anotherArray));


    }
    public static void modifyArray(int[] array){
        array[1]=2;
    }
}
