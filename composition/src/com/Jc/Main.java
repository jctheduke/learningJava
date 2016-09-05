package com.Jc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wall wall = new Wall(10,20,30);
        Furniture furniture = new Furniture(2,1,true,false);
        Room room = new Room(furniture,wall,wall,wall,wall,true);
        String facility = "Nothing";
        System.out.println("Volume of the room is " + room.getVolume() );
        System.out.println("Furniture we provide is as follows");
        System.out.println("We have "+ furniture.getBed() + " beds");
        System.out.println("We have " + furniture.getSofa() + " sofa");

        if(furniture.isAirConditioner() && furniture.isFan()) {
            facility = "Airconditioner and fan";
        }
        else if(furniture.isAirConditioner()){
                facility = "Air conditioner";

            }
        else if (furniture.isFan()){
            facility = "Fan";

        }else
            facility = "No facility";
        System.out.println("We provide you with "+ facility);
    }
}