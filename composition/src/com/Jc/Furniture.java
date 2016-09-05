package com.Jc;

/**
 * Created by priyaranjanjc on 8/30/2016.
 */
public class Furniture {

    private int sofa;
    private int bed;
    private boolean airConditioner;
    private boolean fan;

    public Furniture(int sofa, int bed, boolean airConditioner, boolean fan) {
        this.sofa = sofa;
        this.bed = bed;
        this.airConditioner = airConditioner;
        this.fan = fan;
    }

    public int getSofa() {
        return sofa;
    }

    public int getBed() {
        return bed;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public boolean isFan() {
        return fan;
    }


}

