package com.jokerinya;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

//  Customer
    public Customer addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = queryBranch(branchName);
        if (branch!=null){
            return branch.addCustomer(customerName, initialTransaction);
        }
        System.out.println("There is no branch on the bank with " + branchName);
        return null;
    }
    public Branch addBranch(String name){
        Branch branch = queryBranch(name);
        if (branch != null){
            System.out.println("Branch has been found try to add a new branch.");
            return null;
        }
        branch = new Branch(name);
        this.branches.add(branch);
        System.out.println("Branch has been added.");
        return branch;
    }
//Query Branch
    private Branch queryBranch(String name){
        for (Branch branch: this.branches) {
            if (branch.getBranchName().equals(name)){
                return branch;
            }
        }
        return null;
    }
// List Branch
    public void listBranches(){
        System.out.println("######"+ this.name + "######");
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = branches.get(i);
            System.out.println((i+1) +" - " + branch.getBranchName());
        }
    }
    public void listBranchesCustomersTransactions(){
        System.out.println("######"+ this.name + "######");
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            System.out.println((i+1) + " - "+ branch.getBranchName());
            branch.listCustomers();
        }
    }
// Add Transaction
    public Double addTransaction(String branchName, String customerName, double transaction){
        Branch branch = queryBranch(branchName);
        if (branch != null){
            return branch.addTransaction(customerName, transaction);
        }
        System.out.println("There is no branch with this name. - " + branchName);
        return null;
    }

}
