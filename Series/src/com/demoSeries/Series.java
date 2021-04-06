package com.demoSeries;

public class Series {
    public static long nSum(int n){
        if (n<=0){
            return 0;
        }
        return n + nSum(n-1);
    }
    public static long factorial(int n){
        if (n<=0){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static long fibonacci(int n){
        if (n<=1) {
            return n;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }

}
