package com.Jc;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by priyaranjanjc on 9/7/2016.
 */
public class Transaction {
    private Double amount;
    private String time;


    public Transaction(double amount) {
        // autoboxing of the double amount into Double object
        this.amount = amount;
        this.time = getTime();
    }

    public double getAmount() {
        // unboxing of the Double amount to double amount
        return amount;
    }

    private String getTime() {
        DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss.SSSSSS Z");
        return ZonedDateTime.now().format(FORMATTER);
    }



    public void updateamount(double amount) {
        this.amount = amount;
        this.time = getTime();
        }

    public void printTransaction(){
        System.out.println("Transation time :"+ this.time + "Trasaction amount :" + this.amount);
    }
}

