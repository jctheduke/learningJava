package com.Jc;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	//
        ArrayList<String> places = new ArrayList<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
        InterfaceImplement arrayStorage = new InterfaceImplement();
        arrayStorage.storeArrayList(places);
        arrayStorage.toString();
        arrayStorage.printarray();
        arrayStorage.addToArray("fourthelement");
        arrayStorage.printarray();
    }
}
