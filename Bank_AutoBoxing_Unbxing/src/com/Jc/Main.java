package com.Jc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner  userInput = new Scanner(System.in);
        boolean quit =false;
        Bank bank = new Bank("Dummy");
        while(!quit){
            System.out.println("Please provide the input now");
            switch (userInput.nextInt()){
                case 1:
                    printInstructions();
                    break;
                case 2:
                    System.out.println("Good Please provide the name of the bank");
                    bank = startBank();
                    break;
                case 3:
                    startBranch(bank);
                    break;
                case 4:
                    bank.addCustomer();
                    break;
                case 5:
                    bank.customerTransaction();
                    break;
                case 6:
                    bank.updateTransaction();
                    break;
                case 7:
                    getBankDetail(bank);
                    break;
                case 8:
                    bank.getBalancePerBranch();
                    break;
                case 9:
                    quit = true;
                    System.out.println("quitting the applicaiton");
                    break;
                default:
                    System.out.println("Please give correct input");
            }

        }
    }

    public static void printInstructions(){
        System.out.println("1 : print Instructions \n" +
                "2: Start your Banking Bussiness \n" +
                "3: open a new Branch \n" +
                "4: Add customer to the branch \n" +
                "5: Make a transation for the customer \n" +
                "6: update the transaction \n" +
                "7: get the bank details \n" +
                "8: get balances for each branch \n" +
                "9: quit your application \n");
    }

    public static Bank  startBank(){
        Scanner  userInput = new Scanner(System.in);
        String bankName = userInput.next();
         Bank bank = new Bank(bankName);
         return bank;
    }

    public static void startBranch(Bank bank){
        Scanner  userInput = new Scanner(System.in);
        System.out.println("What is the name of this new branch");
        String branchName = userInput.next();
        bank.addBranch(branchName);
    }

    public static void getBankDetail(Bank bank){
        System.out.println("Name of the bank" + bank.getName());
        System.out.println("Total amount in the bank" + bank.totalAountInBank());
        System.out.println("Total no of branches"+ bank.noOfBranches());
        System.out.println("Total no of customers"+ bank.noOfCustomers());
    }


}
