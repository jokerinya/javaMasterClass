package com.jokerinya;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.branchName = name;
        this.customers = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Double addTransaction(String customerName, double transaction){
        Customer customer = queryCustomer(customerName);
        if (customer==null){
            System.out.println("Couldn't find the customer "+ customerName  + ".");
            return null;
        }
        return customer.addTransaction(transaction);
    }

    public Customer addCustomer(String customerName, double initialTransaction){
        Customer customer = queryCustomer(customerName);
        if (customer!=null){
            System.out.println("There is a customer with the same name - `" + customer.getName() + "`");
            return null;
        }
        Customer newCustomer = new Customer(customerName, initialTransaction);
        this.customers.add(newCustomer);
        System.out.println("Customer " + newCustomer.getName() + " has been added.");
        return newCustomer;
    }

    private Customer queryCustomer(String name){
        for (Customer customer : this.customers) {
            if (customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }

    public void listCustomers(){
        System.out.println("----" + this.branchName+ "---- ");
        for (Customer customer : this.customers) {
            System.out.println("--> Name: " + customer.getName());
            customer.listTransactions();
        }
    }
}
