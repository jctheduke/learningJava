package com.Jc;

import java.util.ArrayList;

/**
 * Created by priyaranjanjc on 9/7/2016.
 */
public class Customer {
    private String name;
    private ArrayList<Transaction> transactions;
    private double balance;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Transaction>();
        this.balance = 0;
    }

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.transactions = new ArrayList<Transaction>();
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addTransaction(double amount){
        if(balance+amount >=0)
        return transactions.add(new Transaction(amount));
        else{
            System.out.println("Balance too low for this transaction");
            return false;
        }
    }

    public void printTransactions(){
        if(transactions.size() != 0){
            for(Transaction transaction : transactions){
                transaction.printTransaction();
            }
        }
    }
    // currently can update only last transactions
    public boolean updateTransaction(double amount){
        if(balance+amount >=0) {
            transactions.get(transactions.size() - 1).updateamount(amount);
            return true;
        }else {
            System.out.println("Balace to low to update this transaction check the amount again");
            return false;
        }
    }

    public boolean sameCustomer(String name){
        if(this.name.equals(name))
            return true;
        else return false;
    }
}
