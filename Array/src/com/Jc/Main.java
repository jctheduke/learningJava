package com.Jc;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here
        int[] arr = getIntegers(5);
        printArray(arr);
        int[] arrSorted = sortArray(arr);
        printArray(arrSorted);
    }

    public static int[] getIntegers(int n){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the numbers you want to print in desending order \r");
        int[] arrayInt = new int[n];

        for(int i = 0; i < n; i++){
            arrayInt[i] = scan.nextInt();
        }
        return arrayInt;
    }

    public static void printArray(int[] arr){
        System.out.println(' ');
        for (int i =0 ; i < arr.length ; i++)
            System.out.print(arr[ i ] + "   ");
    }

    public static int[] sortArray(int[] arr){
        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j< arr.length; j++){
                if (arr[i] < arr[j]){
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a ;
                }

            }
        }
        return arr;
    }
}
