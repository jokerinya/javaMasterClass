package com.jokerinya;

public class LeapYearCalculator {
    public static boolean isLeapYear(int year){
        boolean res = false;
        if(1 <= year && year < 9999){
            /*divided to 400 or divided to 4 but not divided to 100*/
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                res = true;
            }
        }
        return res;
    }
}
