package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(45,  false);
        System.out.println("Printer toner level " + printer.getTonerLevel());
        printer.fillUp();
        System.out.println("Printer toner level " + printer.getTonerLevel());
        printer.print(2000);
        System.out.println("Printed pages " + printer.getPagesPrinted());
    }
}
