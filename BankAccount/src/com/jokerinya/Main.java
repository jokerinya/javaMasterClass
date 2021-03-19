package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        System.out.println("Welcome " + accountOne.getCustomerName());
//        System.out.println("Your account number is " + accountOne.getAccountNumber());
//        System.out.println("Your email is " + accountOne.getEMail());
//        System.out.println("Your phone number is " + accountOne.getPhoneNumber());
//        System.out.println("Your initial balance is " + accountOne.getBalance() + "$");
//        accountOne.depositFunds(10);
//        accountOne.withdrawFunds(25);
//        accountOne.withdrawFunds(20);
//        accountOne.depositFunds(10);
//        accountOne.depositFunds(-1);

//        BankAccount customerOne = new BankAccount();
//        System.out.println("Customer One " + customerOne.getCustomerName() + " Generated with EMPTY parameter.");
//        System.out.println("###################################################");
//        BankAccount customerTwo = new BankAccount("Ahmet");
//        System.out.println("Customer two " + customerTwo.getCustomerName() + " Generated with ONE parameter.");
//        System.out.println("###################################################");
//        BankAccount customerThree = new BankAccount(1234,
//                10, "Jokerinya",
//                "hello@admin.com", "(312) 678 45 34");
//        System.out.println("Customer three " + customerThree.getCustomerName() + " Generated with ALL parameters.");

        VipCustomer customerOne = new VipCustomer();
        System.out.println("Customer One " + customerOne.getName() + " Generated with EMPTY parameter.");
        System.out.println("Default Email = " + customerOne.getEmail());
        System.out.println("Default Credit = " + customerOne.getCreditLimit());
        System.out.println("###################################################");

        VipCustomer customerTwo = new VipCustomer("Customer Two", "two@gmail.com");
        System.out.println("Customer two " + customerTwo.getName() + " Generated with TWO parameter.");
        System.out.println("Email = " + customerTwo.getEmail());
        System.out.println("Default Credit Limit = " + customerTwo.getCreditLimit());
        System.out.println("###################################################");

        VipCustomer customerThree = new VipCustomer("Three", 5000, "3@gmail.com");
        System.out.println("Customer three " + customerThree.getName() + " Generated with ALL parameters.");
        System.out.println("Email = " + customerThree.getEmail());
        System.out.println("Credit Limit = " + customerThree.getCreditLimit());



    }
}
