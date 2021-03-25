package com.jokerinya;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> srtArrayList = new ArrayList<>();
        srtArrayList.add("Jokerinya");
        System.out.println(srtArrayList.get(0));
// ArrayLists don't accept primitive types as parameters.
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));
        System.out.println(intClassArrayList.get(0).getMyValue());
// Autoboxing
//        Integer anInteger = new Integer(54); // old way
        Integer integer = 54;  // Integer.valueOf(54);
        int anInt = integer;  // integer.intValue();
        Double aDouble = 12.25;
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(i);
            System.out.println(integerArrayList.get(i));
        }

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        for (double i = 0.0; i < 10.0; i+=1.5) {
            doubleArrayList.add(i*0.1);
        }
        for (Double value : doubleArrayList) {
            System.out.println(value);
        }

    }
}






























