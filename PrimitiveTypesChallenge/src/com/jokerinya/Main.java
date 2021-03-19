package com.jokerinya;

public class Main {

    public static void main(String[] args) {
        /*Challenge*/
        byte challengeByte = 120;
        short challengeShort = 32000;
        int challengeInt = 7;
        long challengeLong = 50000L + 10L * (challengeShort + challengeInt + challengeByte);
        System.out.println(challengeLong);
    }
}
