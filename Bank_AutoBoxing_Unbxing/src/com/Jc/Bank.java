package com.Jc;

import java.util.ArrayList;

/**
 * Created by priyaranjanjc on 9/7/2016.
 */
public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    // Update the Bank name in case of diaster :p
    public void updateName(String name) {
        this.name = name;
    }

    // get total no of customers in the bank
    public int noOfCustomers() {
        int noOfCustomers = 0;
        for (Branch branch : branches) {
            noOfCustomers = branch.noOfCustomers();
        }
        return noOfCustomers;
    }

    // gets total no of branches in the bank
    public int noOfBranches() {
        return branches.size();
    }

    // gets the total amount the whole bank
    public double totalAountInBank() {
        double totalAmount = 0;
        for (Branch branch : branches) {
            totalAmount += branch.getTotalAmount();
        }
        return totalAmount;
    }

    // get balance for each branch
    public void getBalancePerBranch() {
        for (Branch branch : branches) {
            System.out.println(branch.getName() + "--" + branch.getTotalAmount());
        }
    }

    public boolean addBranch(String name){
        for(Branch branch:branches){
            if (branch.getName().equals(name)) {
                System.out.println("There is aleady a branch with this name.Please provide new name");
                return false;
            }
        }
        branches.add(new Branch(name));
        return true;
    }


}