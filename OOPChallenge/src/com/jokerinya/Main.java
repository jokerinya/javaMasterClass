package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Addition onion = new Addition("Onion", 1.5);
        Addition potato = new Addition("Potato", 1.5);
        Addition lettuce = new Addition("Lettuce", 0.5);
        Addition ketchup = new Addition("Ketchup", 0.5);
        Addition chips = new Addition("Ketchup", 1.5);
        Addition drink = new Addition("Ketchup", 1.5);

        System.out.println("---------------Basic------------------");
        Basic basic = new Basic("Basic", "Sesame", "Beaf", 12.00,
                onion, potato, lettuce);
        System.out.println(basic.getName() + " with " + basic.getBreadRoll() + " - Total " + basic.getTotalPrice() + "\n" +
                " Base Price " + basic.getBasePrice() + "$\n" + basic.getAdditions() + "Additions Total " +
                basic.getAdditionsPrice());

        System.out.println("---------------Deluxe------------------");
        Deluxe deluxe = new Deluxe("Deluxe", "Sumac", "Fish", 8.5);
        System.out.println(deluxe.getName() + " with " + deluxe.getBreadRoll() +  "- Total " + deluxe.getTotalPrice() + "\n" +
                " Base Price " + deluxe.getBasePrice() + "$\n" + deluxe.getAdditions()+ "Additions Total " +
                deluxe.getAdditionsPrice());

        System.out.println("---------------Healthy------------------");
        Healthy healthy = new Healthy("Healthy", "Chicken", 10.0, lettuce, onion);
        System.out.println(healthy.getName() + " with " + healthy.getBreadRoll() +  "- Total " + healthy.getTotalPrice() + "\n" +
                " Base Price " + healthy.getBasePrice() + "$\n" + healthy.getAdditions()+ "Additions Total " +
                healthy.getAdditionsPrice());
    }
}
