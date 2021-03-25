package com.jokerinya;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

// Start Transactions with initial Double amount
    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public Double addTransaction(double transaction){
        this.transactions.add(transaction);
        System.out.println(transaction +" transaction has been added to "+ this.name);
        return transaction;
    }

    public void listTransactions(){
        for (Double transaction : this.transactions) {
            System.out.println("\t * " + transaction);
        }
    }
}
