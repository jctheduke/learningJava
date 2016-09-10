package com.Jc;

import java.util.ArrayList;

/**
 * Created by priyaranjanjc on  ${date}.
 */
public class InterfaceImplement implements Storage {

    ArrayList<String> array;
    @Override
    public ArrayList getList() {
        return this.array;
    }

    @Override
    public void storeArrayList(ArrayList array) {
        this.array = array;
    }

    public void printarray(){
        for(String element: array){
            System.out.println(element);
        }
    }

    public void addToArray(String element){
        array.add(element);
    }
    @Override
    public String toString() {
        System.out.println(array.size() + "is the size of the array");
        return null;
    }
}
