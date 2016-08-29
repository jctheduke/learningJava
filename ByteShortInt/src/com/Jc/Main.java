package com.Jc;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinvalue = -2_147_483_648;
        int myMaxvalue =  2_147_483_647;

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println(myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;

        // long has a width of 64
        long myLongValue = 100L;
    }
}
