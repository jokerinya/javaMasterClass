package com.company;

public class Main {

    public static void main(String[] args) {
        /* 32 bits of data */
        int myMinValue = Integer.MIN_VALUE;  // -2147483648
        int myMaxValue = Integer.MAX_VALUE;  // 2147483647
        System.out.println("Min " + myMinValue);
        System.out.println("Max " + myMaxValue);
        System.out.println("Difference between them= "+ (myMinValue + myMaxValue));
        System.out.println("Min -1 equals to Max (overflow) " + (myMinValue - 1));
        System.out.println("Max +1 equals to Min (underflow) " + (myMaxValue + 1));
        int myMaxTest = 2_147_483_647; // int
        /* This data type is related with memory usage, consumes less memory (8 bits)*/
        byte myMinByteValue = Byte.MIN_VALUE;  // -128
        byte myMaxByteValue = Byte.MAX_VALUE;  // 127
        System.out.println("Max Byte " + myMaxByteValue);
        System.out.println("Min Byte " + myMinByteValue);
        /* 16 bits of data */
        short myMinShortValue = Short.MIN_VALUE;  // -32768
        short myMaxShortValue = Short.MAX_VALUE;  // 32767
        System.out.println("Max Short " + myMaxShortValue);
        System.out.println("Min Short " + myMinShortValue);
        /* 64 bits of data */
        long myLongNum = 100L;  // should be L added at
        long myMinLongValue = Long.MIN_VALUE;  // -9223372036854775808
        long myMaxLongValue = Long.MAX_VALUE;  // 9223372036854775807
        System.out.println("Max Long " + myMaxLongValue);
        System.out.println("Min Long " + myMinLongValue);

        /*Casting: Default value is int for Java */
        byte myNewByteValue = (byte) (myMinByteValue / 2);  // this means casting behave it byte not int
        short myNewShortValue = (short) (myMinShortValue / 2);  // this means casting behave it short not int
    }
}
