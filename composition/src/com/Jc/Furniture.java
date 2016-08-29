package com.Jc;

/**
 * Created by priyaranjanjc on 8/26/2016.
 */
public class Furniture {

    private int chairs;
    private int sofa;
    private int tv;
    private int beds;
    private int lights;
    private int airconditioner;
    private int fans;

    public Furniture(int chairs, int sofa, int tv, int beds, int lights, int airconditioner, int fans) {
        this.chairs = chairs;
        this.sofa = sofa;
        this.tv = tv;
        this.beds = beds;
        this.lights = lights;
        this.airconditioner = airconditioner;
        this.fans = fans;
    }

    public int getChairs() {
        return chairs;
    }

    public int getSofa() {
        return sofa;
    }

    public int getTv() {
        return tv;
    }

    public int getBeds() {
        return beds;
    }

    public int getLights() {
        return lights;
    }

    public int getAirconditioner() {
        return airconditioner;
    }

    public int getFans() {
        return fans;
    }

    private int totalUnits(){
        return chairs + sofa + tv + beds + lights + airconditioner + fans;
    }

    public int gettotal(){
        return totalUnits();
    }
}
