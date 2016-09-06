package com.Jc;

import java.util.Scanner;

public class Main {
    private enum bread{
        Itallian,Plain,Crusted
    }


    public static void main(String[] args) {
	// write your code here
        BasicHam Burger;
        String userMeat;
        String userBread;

        System.out.println("Select the type of the Hamburger You want");
        System.out.println("1. Basic Ham "+'\n'+"2. HealthyHam"+'\n'+"3. Delux Ham");

        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();

        switch (n){

            case 1:
                System.out.println("Choose the Bread");
                System.out.println("Itallian" + '\n' + "Plain" + '\n' + "Crusted");
                userBread = userInput.next();
                System.out.println("Choose the meat of your liking");
                System.out.println("chicken"+'\n'+"Beef"+'\n'+"Pork");
                userMeat = userInput.next();
                double BasicHamCost = 7.4;
                Burger = new BasicHam(userBread,userMeat,BasicHamCost);
                break;

            case 2:
                System.out.println("Choose the meat of your liking");
                System.out.println("chicken"+'\n'+"Beef"+'\n'+"Pork");
                userMeat = userInput.next();
                double HealthyHamCost = 9.4;
                Burger = new HealthyBurger(userMeat,HealthyHamCost);
                break;

            case 3:
                System.out.println("Choose the Bread");
                System.out.println("Itallian" + '\n' + "Plain" + '\n' + "Crusted");
                userBread = userInput.next();
                System.out.println("Choose the meat of your liking");
                System.out.println("chicken"+'\n'+"Beef"+'\n'+"Pork");
                userMeat = userInput.next();
                double DeluxHamCost = 10.4;
                Burger = new DeluxHam(userBread,userMeat,DeluxHamCost);
                break;
            default:
                Burger = new BasicHam("Plain","chicken",7.43);
                break;


        }
        System.out.println("Do you want extra addon's 1.yes 2.No");
        int add = userInput.nextInt();
        while(add == 1){
            Burger.avaibleAddOn();
            System.out.println("Choose the addon you want");
            int addon = userInput.nextInt();
            switch (addon){
                case 1:
                    Burger.setCarrot(true);
                    break;
                case 2:
                    Burger.setTomato(true);
                    break;
                case 3:
                    Burger.setRanch(true);
                    break;
                case 4:
                    Burger.setLettuce(true);
                    break;
                case 5:
                    Burger.setSpinach(true);
                    break;
                case 6:
                    Burger.setOnions(true);
                    break;
                default:
                    System.out.println("Please choose the correct answer");
            }
            Burger.showBillDetails();
            System.out.println("Do you want add More addon's 1.yes 2.No");
            add = userInput.nextInt();
        }
        System.out.println("Your total bill is "+ Burger.getTotalBill());
        System.out.println("Have a nice day : )");
        System.exit(1);
    }

}
