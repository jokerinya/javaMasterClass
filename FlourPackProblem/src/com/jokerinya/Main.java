package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(canPack(1,0,5));
//        System.out.println(canPack(0,5,4));
//        System.out.println(canPack(2,2,11));
//        System.out.println(canPack(2,1,5));
//        System.out.println(canPack(4,18,19));
        System.out.println(getLargestPrime(31));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount<0 || smallCount<0 || goal<0) return false;
        if (bigCount*5 + smallCount < goal){
            return false;
        }
        return (goal%5 <= smallCount);
    }
    public static int getLargestPrime(int number){
        if (number<2){
            return -1;
        }
        int i;
        for (i=2;i<=number;i++){
            if (number%i==0){
                number/=i;
                i--;
            }
        }
        return i;
    }
}
