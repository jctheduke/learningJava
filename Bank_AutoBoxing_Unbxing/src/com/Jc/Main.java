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
                    addCustomer();
            }

        }
    }

    public static void printInstructions(){
        System.out.println("1 : print Instructions" +
                "2: Start your Banking Bussiness" +
                "3: open a new Branch" +
                "4: Add customer to the branch" +
                "5: Make a transation for the customer" +
                "6: update the transaction" +
                "7: get the bank details" +
                "8: get balances for each branch" +
                "9: quit your application");
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

    public static void addCustomer(Bank bank){
        Scanner  userInput = new Scanner(System.in);
        System.out.println("What branch this customer want to join");
        String branchName = userInput.next();
        bank.
    }
}
