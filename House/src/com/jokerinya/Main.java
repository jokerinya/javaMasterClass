package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Room room1 = new Room("Hanna's", 2, new CalculateVolume(2,4,2));
        Room room2 = new Room("Tim's", 1, new CalculateVolume(3,4,2));
        Room room3 = new Room("Adam's", 1, new CalculateVolume(2,5,2));
        House myHouse = new House(room1, room2,room3);
        System.out.println("MyHouse price is " + myHouse.getPrice());
        System.out.println("MyHouse is " + myHouse.getTotalVolume() + " m2.");

        System.out.println("----------------------------------------------------------------");
        House hotel = new House(room1);
        System.out.println("Hotel price is " + hotel.getPrice());
        System.out.println("Hotel is " + hotel.getTotalVolume() + " m2.");

        House two = new House(room1, room2);
        System.out.println("Two price is " + two.getPrice());
        System.out.println("Two is " + two.getTotalVolume() + " m2.");

        System.out.println("----------------------------------------------------------------");
        myHouse.light(room1);
        myHouse.light(room2);
        myHouse.light(room3);
        myHouse.light(room1);



    }
}
