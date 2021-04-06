package com.jokerinya;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
//    private int balance;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
//        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount>0){
            this.transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposit added, balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums.");
        }
    }
    public void withdraw(int amount){
        int withdrawal = -amount;
        if (withdrawal<0){
            this.transactions.add(withdrawal);
            balance += withdrawal;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot withdraw negative sums.");
        }
    }
    public void calculateBalance(){
        this.balance = 0;
        for (int i: this.transactions){
            this.balance += i;
        }
        System.out.println("Calculated balance is "+ this.balance);
    }
}
