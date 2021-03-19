package com.jokerinya;

public class BarkingDog {
    public static boolean shouldWakeUp( boolean barking, int hourOfDay) {
        boolean wakeUp = false;
        if(hourOfDay>23 || hourOfDay<0) wakeUp = false;
        else if ((hourOfDay<8 || hourOfDay>22) && barking) wakeUp = true;
        return wakeUp;
    }
}
