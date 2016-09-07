package com.Jc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Please provide the name of the contact book");
//        Scanner userIn = new Scanner(System.in);
        ContactBook Contactlist = new ContactBook();
        boolean quit= false;
        System.out.println("Press 1 for instruction and 7 to quit");
        while(!quit) {
            System.out.println("Please give input now");
            Scanner userInput = new Scanner(System.in);
            switch (userInput.nextInt()){
                case 1:
                    System.out.println("1. Print Instructions \n" +
                            "2. Print Contact List\n" +
                            "3. AddContact\n" +
                            "4. Search for contact\n" +
                            "5. Update Contact\n" +
                            "6. Delete Contact\n" +
                            "7. quit application \n\r");
                    break;
                case 2:
                    Contactlist.printContacts();
                    break;
                case 3:
                    System.out.println("Pleae provide the contact name ");
                    String contactName = userInput.next();
                    System.out.println("Please provide the contact number");
                    String contactNumber = userInput.next();
                    if(Contactlist.addContact(contactName,contactNumber))
                        System.out.println("Contact added succesfully");
                    break;
                case 4:
                    System.out.println("Please provide the name of the contact to be searched");
                    String searchName = userInput.next();
                    Contactlist.searchContact(searchName);
                    break;
                case 5:
                    System.out.println("Please provide the name of the contact to update ");
                    String updateContactName = userInput.next();
                    System.out.println("Please provide the updated number");
                    String updatedNumber = userInput.next();
                    Contactlist.updateContactNumber(updateContactName,updatedNumber);
                    break;
                case 6:
                    System.out.println("Please provide the name of the contact you wish to delete");
                    String removingContactName = userInput.next();
                    Contactlist.deleteContact(removingContactName);
                    break;
                case 7:
                    quit = true;
                    System.out.println("Closing the contact book");
                    break;
                default:
                    System.out.println("Please provide the correct option");
            }
        }
    }

}
