package com.Jc;

/**
 * Created by priyaranjanjc on 8/30/2016.
 */
public class Room {

    private double volume;
    private Furniture furniture;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private boolean internet = false;

    public Room(Furniture furniture, Wall wall1, Wall wall2, Wall wall3, Wall wall4, boolean internet) {
        this.furniture = furniture;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.internet = internet;
    }

    public double getVolume() {
        volume = calculateVolume();
        return this.volume;
    }

    private double calculateVolume(){
       double Calvolume = (wall1.getLength() * wall4.getLength()*wall1.getHeight());
        return Calvolume;
    }

    private Furniture getFurniture() {
        return furniture;
    }

    public int getFurnitureCount(Furniture furniture){
        return (furniture.getBed() + furniture.getSofa());
    }

    public boolean turnOnAC(){
        if (furniture.isAirConditioner()){
            System.out.println("Ac is turned on!");
            return true;
        }else{
            System.out.println("Sorry we dont have AC , you can use the fan!");
            return false;
        }
    }

    public boolean turnOnFan(){
        if(furniture.isFan()){
            System.out.println("Turning of the Fan");
            return true;
        }
        else {
            System.out.println("You are out of luck we are out of fan too");
            return false;
        }
    }
    private boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean provideInternet(){
        if(isInternet()){
            System.out.println("Internet is already provided to you .Please use the give credentials");
            return true;
        }else {
            setInternet(true);
            System.out.println("Your internet is started.Please contact us for the credentials");
            return true;
        }
    }
}
