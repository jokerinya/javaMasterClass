package com.jokerinya;

public class Main {

    public static void main(String[] args) {



        Bank bank = new Bank("HSBC");

        Branch newYork = bank.addBranch("New York");
        Branch istanbul =  bank.addBranch("Istanbul");
        System.out.println("----Branches-----");
        bank.listBranches();
// Branch adds customer
        Customer max = istanbul.addCustomer("Max", 12.34);
// Branch customer and transactions
        istanbul.listCustomers();
// Bank adds customer
        Customer marry = bank.addCustomer("Istanbul", "Marry", 12.445);
        Customer james = bank.addCustomer("New York", "James", 110.0);
// Bank adds transactions
        Double transaction =  bank.addTransaction("New York", "James", 34.89);
// Customer transactions
        james.addTransaction(-2.34);
        james.listTransactions();
// All transactions
        System.out.println("\n\n\n");
        bank.listBranchesCustomersTransactions();





//        System.out.println(bank.getBranches());
    }
}
