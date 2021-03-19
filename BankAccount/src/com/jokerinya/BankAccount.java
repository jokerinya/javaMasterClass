package com.jokerinya;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String eMail;
    private String phoneNumber;

    public BankAccount(){
        this(1111, 0, "Default", "default@gmail.com", "(000)00000");
//        System.out.println("Empty constructor is called.");
    }

    public BankAccount(String customerName) {
        this(1111,10.3,customerName,"default@gmail.com","(11122)5678");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String eMail, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
//        System.out.println("Account constructor with parameters are called.");
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEMail(String eMail){
        this.eMail = eMail;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEMail(){
        return this.eMail;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositFunds(double funds){
        if (funds>0){
            this.balance += funds;
            System.out.println("Your " + funds + "$ added to your account, new status is " + this.balance + "$");
        } else {
            System.out.println("Invalid value, not completed.");
        }
    }

    public void withdrawFunds(double funds){
        if (funds<0 || funds>getBalance()){
            System.out.println("Invalid entry, your fund level is more than balance or funds is below/equal to zero");
        } else {
            this.balance -= funds;
            System.out.println("Request done, your funds " + funds + " withdrawn, your new balance is "+ this.balance);
        }
    }
}
