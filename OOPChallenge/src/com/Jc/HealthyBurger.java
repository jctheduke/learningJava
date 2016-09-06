package com.Jc;

/**
 * Created by priyaranjanjc on 9/4/2016.
 */
public class HealthyBurger extends BasicHam {
    private boolean spinach = super.isSpinach();
    private boolean onions = super.isOnions();


    public HealthyBurger(String meat, double totalCost) {
        super("Brown rye", meat, totalCost);
    }

    @Override
    public void setSpinach(boolean spinach) {
        if (this.spinach == spinach){
            System.out.println("Spinach is already added");
        }
        else if(spinach){
             setNoOfItems(getNoOfItems()+1) ;
             setTotalCost(getTotalBill()+0.8);
            this.spinach = true;
        }
        else{
            setNoOfItems(getNoOfItems()-1);
            setTotalCost(getTotalBill()-0.8);
            this.spinach =false;
        }
    }
    @Override
    public void setOnions(boolean onions) {
        if (this.onions == onions){
            System.out.println("Onions are already added");
        }
        else if(onions){
            setNoOfItems(getNoOfItems()+1) ;
            setTotalCost(getTotalBill()+0.6);
            this.onions = true;
        }
        else{
            setNoOfItems(getNoOfItems()-1);
            setTotalCost(getTotalBill()-0.6);
            this.onions = false;
        }
    }

    @Override
    public void avaibleAddOn() {
        System.out.println("Available additional");
        System.out.println("1.Carrot,\n2.tomato,\n3.ranch,\n4.lettuce,\n5.spinach,\n6.onions");
    }
}
