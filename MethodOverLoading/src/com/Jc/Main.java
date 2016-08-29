package com.Jc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(calcFeetAndInchesToCentimeters(0,16));
    }

    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if (feet < 0)
            return -1;
        if (inches < 0 && inches > 12)
                return -1;
        double inchToCenti = 2.54;
        double footToInch  = 12;

        double totalInches = feet*footToInch + inches ;
        return calcFeetAndInchesToCentimeters(totalInches);
    }

    public static  double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0)
            return -1;

        double inchToCenti = 2.54;
        return inches * inchToCenti;
    }
}
