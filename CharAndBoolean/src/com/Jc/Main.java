package com.Jc;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        char mychar = '\u00AE';
//        System.out.println("Unicode out put was " + mychar);
//        String mySting = "50";
//        int myInt = 20;
//        //mySting = mySting + myInt;
//
//        boolean isAlien =false;
//        if( isAlien == false)
//            System.out.println("It is not a alien");
//
//        double firstDouble = 20d;
//        double secondDouble = 80d;
//        double thirdDouble = (firstDouble + secondDouble) * 25d;
//        double remainder = (thirdDouble)%40 ;
//
//        if (remainder <= 20)
//            System.out.println("Total was over the limit");
        int score = 10000 ;
        int levelCompleted = 8;
        int bonus = 200;
        boolean gameOver = true;

        if ( gameOver ){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore );
        }
    }
}
