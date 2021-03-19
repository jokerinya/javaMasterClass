package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int counter = 0;
//        while (counter != 5){
//            System.out.println("Loop is " + counter);
//            counter++;
//        }
//        System.out.println("#########################################");
//        counter = 0;
//        while (true){
//            if (counter == 5) break;
//            System.out.println("Loop is " + counter);
//            counter++;
//        }
//        System.out.println("#########################################");
//        counter = 0;
//        do {
//            System.out.println("Loop is " + counter);
//            counter++;
//        } while (counter != 5);
//        System.out.println("#########################################");
//        for (counter = 0; counter < 5; counter++) {
//            System.out.println("Loop is " + counter);
//        }
        /*Challenge*/
        System.out.println(isEvenNumber(4));
        int number = 4;
        int endNumber = 20;
        int sum = 0;
        int counter = 0;

        while (number <= endNumber){
            number++;
            if (!isEvenNumber(number)) continue;
            System.out.println("Loop is " + number);
            sum += number;
            counter++;
            if (counter==5) break;
        }
        System.out.println("Total = " + sum);


    }
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
