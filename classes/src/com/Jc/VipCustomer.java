package com.Jc;

/**
 * Created by priyaranjanjc on 8/23/2016.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("priyaranjan",2000.0,"priyaranjan780@gmail.com");
        System.out.println("this is a empyt construcutor");
    }

    public VipCustomer(String name, String email) {
        this(name,2000.0,email);
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
