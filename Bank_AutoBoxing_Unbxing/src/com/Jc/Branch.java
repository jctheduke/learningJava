package com.Jc;

import java.util.ArrayList;

/**
 * Created by priyaranjanjc on 9/7/2016.
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customersList;
    private double totalAmount;

    public Branch(String name) {
        this.name = name;
        this.customersList = new ArrayList<Customer>();
        this.totalAmount = 0;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getName() {
        return name;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void addCustomer(String customerName){
        if(!findCustomer(customerName)){
            customersList.add(new Customer(customerName));
        }
        else System.out.println("Customer already in the data base");
    }

    private boolean findCustomer(String customerName){
        for(Customer customer : customersList){
            return customer.sameCustomer(customerName);
        }
        return false;
    }

    public int seachCustomer(String  name){
        for(int i =0 ; i < customersList.size();i++){
            if(customersList.get(i).sameCustomer(name)){
                return i;
                }
        }
        return -1;
    }

    public boolean addTrasaction(String name,double amount){
        int index = seachCustomer(name);
        if(index != -1){
            customersList.get(index).addTransaction(amount);
            return true;
        }
        else{
            System.out.println("Customer is not yet added . Please add customer to this branch");
            return false;
        }
    }

    public boolean updateTransaction(String name,double amount){
        int index = seachCustomer(name);
        if(index != -1){
            customersList.get(index).updateTransaction(amount);
            return true;
        }
        else{
            System.out.println("Customer is not yet added . Please add customer to this branch");
            return false;
        }
    }

    public void updateTotalAmount(){
        double amount = 0;
        for(Customer customer : customersList){
            amount += customer.getBalance();
        }
        this.totalAmount =amount;
    }

    public int noOfCustomers(){
        return customersList.size();
    }
}
