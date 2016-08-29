package com.Jc;

/**
 * Created by priyaranjanjc on 8/23/2016.
 */

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){

        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColour() {

        return colour;
    }
}
