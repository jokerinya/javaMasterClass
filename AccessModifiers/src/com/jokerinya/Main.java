package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account jokersAccount = new Account("Jokerinya");
        jokersAccount.deposit(1000);
        jokersAccount.withdraw(500);
        jokersAccount.withdraw(-200);
        jokersAccount.deposit(-20);
        jokersAccount.calculateBalance();

        System.out.println("Balance on account is " + jokersAccount.getBalance());
    }
}
