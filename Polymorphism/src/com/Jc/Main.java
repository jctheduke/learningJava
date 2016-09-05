package com.Jc;

class Car{
    private boolean engine;
    private int cc = 1400;
    private double tyres = 14.3;
    private boolean sportMode = false;

    public Car(int cc, double tyres, boolean sportMode) {
        this.cc = cc;
        this.tyres = tyres;
        this.sportMode = sportMode;
        this.engine = false;
    }

    public Car() {

    }

    public void turnOnEngine(){
        this.engine = true;
    }

    public void accelerate(){

        System.out.println("A nomarl car can accelarate from 0 -60 mph in 15 seconds");
    }

    public void applyBrake(){
        System.out.println("A normal car can come to stop in from 60 mph in 5 secs");
    }
}



class Nissan extends Car{

    private String name;

    public Nissan() {
        super(2400,  19, true);
        this.name = "Murrano";
    }

    @Override
    public void accelerate() {
        System.out.println("With  a sport Mode  and a beadfy 2.4 Liter enginer Nissa Murano can accelarate  from 0-60 in 5.4 secs");
    }

    @Override
    public void applyBrake() {
        System.out.println("With a 19 inch tyres Nissan Murrano can stop in 3 secs from 60 mph" );
    }

    }






public class Main {

    public static void main(String[] args) {
	// write your code here

        Car normalCar = new Car();
        Car nissan =  new Nissan();

        normalCar.turnOnEngine();
        normalCar.accelerate();
        normalCar.applyBrake();

        nissan.turnOnEngine();
        nissan.accelerate();
        nissan.applyBrake();
    }
}
