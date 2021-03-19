package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if(i%15==0){
                sum += i;
                System.out.println("Number = "+i);
                counter++;
                if(counter==5) break;
            }
        }
        System.out.println("Sum = "+sum);
        System.out.println("##################################");
        System.out.println(sumOdd(10, 5));
    }

    public static boolean isOdd(int number){
        if (number<0) return false;
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end){
        if (start<0 || end<0 || start>end) return -1;
        int sum =0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}
