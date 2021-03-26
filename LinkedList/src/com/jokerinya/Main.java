package com.jokerinya;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Jokerinya", 12.45);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(5678.34);
        System.out.println("Balance for customer " + customer.getName() + " = " + customer.getBalance());
        System.out.println("Balance for customer " + anotherCustomer.getName() + " = " + anotherCustomer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + " - " + intList.get(i));
        }
        intList.add(1,2);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + " - " + intList.get(i));
        }

    }
}
