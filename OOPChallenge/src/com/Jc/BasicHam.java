package com.Jc;

/**
 * Created by priyaranjanjc on 9/4/2016.
 */
public class BasicHam {

    private String rollType;
    private String meat;
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean carrot = false;
    private boolean ranch= false;
    private boolean spinach = false;
    private boolean onions = false;

    public boolean isSpinach() {
        return spinach;
    }

    public boolean isOnions() {
        return onions;
    }

    public void setSpinach(boolean spinach) {
        System.out.println("Give the correct out put");
    }

    public void setOnions(boolean onions) {
        System.out.println("Please provide the correct output from 1-4");
    }

    private double  totalCost;
    private int noOfItems = 0;

    public BasicHam(String rollType, String meat, double totalCost) {
        this.rollType = rollType;
        this.meat = meat;
        this.totalCost = totalCost;
    }

    public void setLettuce(boolean lettuce) {
        if (this.lettuce == lettuce){
            System.out.println("Lettuce is as you desired");
        }
        else if(lettuce){
            this.noOfItems += 1;
            this.totalCost += .6;
        }
        else{
            this.noOfItems -= 1;
            this.totalCost -= .6;
        }
    }

    public void setTomato(boolean tomato) {
        if (this.tomato == tomato){
            System.out.println("Lettuce is as you desired");
        }
        else if(tomato){
            this.noOfItems += 1;
            this.totalCost += .3;
        }
        else{
            this.noOfItems -= 1;
            this.totalCost -= .3;
        }
    }

    public void setCarrot(boolean carrot) {
        if (this.carrot == carrot){
            System.out.println("Lettuce is as you desired");
        }
        else if(carrot){
            this.noOfItems += 1;
            this.totalCost += .4;
        }
        else{
            this.noOfItems -= 1;
            this.totalCost -= .4;
        }
    }

    public void setRanch(boolean ranch) {
        if (this.ranch == ranch){
            System.out.println("Lettuce is as you desired");
        }
        else if(ranch){
            this.noOfItems += 1;
            this.totalCost += .7;
        }
        else{
            this.noOfItems -= 1;
            this.totalCost -= .7;
        }
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }

    public double getTotalBill() {
        return this.totalCost;
    }

    public int getNoOfItems() {
        return this.noOfItems;
    }

    public void avaibleAddOn(){
        System.out.println("Available additional");
        System.out.println("1.Carrot,\n2.tomato,\n3.ranch,\n4.lettuce");
    }
    public void showBillDetails(){
        String details = "You ordered a ham burger";
        if(noOfItems > 0){
            details =details +"with : ";
            if(lettuce)
                details = details + "lettuce ";
            if(carrot)
                details = details+ "carrot ";
            if(ranch)
                details = details + "ranch ";
            if(tomato)
                details = details + "tomato ";
        }

        System.out.println(details + "There are total of "+ getNoOfItems() +" additionals" + " and total cost of the biil is " + getTotalBill());

    }
}

