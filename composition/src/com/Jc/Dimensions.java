package com.Jc;

/**
 * Created by priyaranjanjc on 8/26/2016.
 */
public class Dimensions {

    // imagining room to be in cuboid
    private double length;
    private double width;
    private double heigth;

    public Dimensions(double length, double width, double heigth) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;

    }

    public double getLength() {
        return length;
    }

    public double getwidth() {
        return width;
    }

    public double getheigth() {
        return heigth;
    }
    
    public double getVolume(){
        return length*width*heigth;
    }

}

