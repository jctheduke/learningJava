package com.Jc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // width of int is 32
        int myIntValue = 5 / 2;

        //width of float = 32(4 bytes)
        float myFloatValue = 5f / 3f;
        // width of double is 64 (8 bytes)
        double myDoubleValue = 5.33_2332d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
    }
}
