package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSameLastDigit(234,66,126));
    }
    public static boolean isValid(int number){
        return !(number<10 || number>1000);  // 10<number<1000
    }
    public static boolean hasSameLastDigit(int x, int y, int z){
//        if (isValid(x) && isValid(y) && isValid(z)){
//            return (x%10 == y%10) || (x%10 == z%10) || (y%10 == z%10);
//        } else {
//            return false;
//        }
        return (isValid(x) && isValid(y) && isValid(z)) && ((x%10 == y%10) || (x%10 == z%10) || (y%10 == z%10));
    }
}
