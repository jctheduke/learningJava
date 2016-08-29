package com.Jc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        BankAccount priyaranjan = new BankAccount();
        priyaranjan.deposit(10000);
        System.out.println(priyaranjan.getBalance());
        priyaranjan.withDraw(2000000);
        priyaranjan.withDraw(100);
        System.out.println(priyaranjan.getBalance());
    }
}
