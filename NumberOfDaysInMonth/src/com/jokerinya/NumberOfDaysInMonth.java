package com.jokerinya;

public class NumberOfDaysInMonth {
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

    public static int getDaysInMonth(int month, int year){
        if((month<1 || month > 12) || (year<1 || year >9999)){
            return -1;
        }
        switch (month){
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }

    }



}




