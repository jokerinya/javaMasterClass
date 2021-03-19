package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWakeUp(false, 2));
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));
        System.out.println(BarkingDog.shouldWakeUp(true, 12));

    }
}
