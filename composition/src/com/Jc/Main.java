package com.Jc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Room rm = new Room(new Dimensions(14.5,18,10) ,new Furniture(3,1,0,0,3,1,1));
        System.out.println(rm.demen.getVolume());
        System.out.println(rm.furni.gettotal());
    }
}

