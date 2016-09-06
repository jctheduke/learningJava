package com.Jc;

/**
 * Created by priyaranjanjc on 9/4/2016.
 */
public class DeluxHam extends BasicHam {
    public DeluxHam(String rollType, String meat, double totalCost) {
        // adding extra price for additional chips and cooldrinks
        super(rollType, meat, totalCost+2.1);
    }

    public void whatIGet(){
        System.out.println("With a dealux ham you get basic ham with optional additional,chips and drink");
    }
}
