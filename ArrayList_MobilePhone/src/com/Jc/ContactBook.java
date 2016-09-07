package com.Jc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by priyaranjanjc on 9/6/2016.
 */
public class ContactBook {
    private ArrayList<Contact> book;

//    public ContactBook(ArrayList<Contact> book) {
//        this.book = book;
//    }
    public ContactBook(){
        this.book = new ArrayList<Contact>();
    }

    public void printContacts() {
        System.out.println("Name - PhoneNumber");
        if(book.size() == 0)
            System.out.println("No contacts");
        else{
        for (Contact contact : book) {
            contact.printContact();
        }
        }
    }

    public boolean addContact(String name, String phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        if (findContact(newContact) > -1) {
            return false;
        } else {
            book.add(newContact);
            return true;
        }
    }

    private int findContact(Contact contact) {
        return book.indexOf(contact);
    }

    private int findContact(String name) {
        for (Contact contact : book) {
            System.out.println(contact.checkName(name));
            if (contact.checkName(name)) {
                return findContact(contact);
            }
        }
        return -1;
    }

    public boolean updateContactNumber(String name, String newNumber) {
        int index = findContact(name);
        if (index < 0) {
            System.out.println("This contact is not present in the Contact list \n 1.Do you want to add the contact? \n 2.Back ");
            Scanner userInput = new Scanner(System.in);
            int userChoice = userInput.nextInt();
            while (true) {
                if (userChoice == 1) {
                    addContact(name, newNumber);
                    return true;
                } else if (userChoice != 2) {
                    System.out.println("Please provide the correct input");
                    return false;
                }
            }
        }
        else{
            book.get(index).updateNumber(newNumber);
            return true;
        }
    }

    public boolean deleteContact(String name){
        int index = findContact(name);
        if (index < 0) {
            System.out.println("This Contact is not present in the Contact list. Please check the name again");
            return false;
        }
        else {
            book.remove(index);
            return true;
        }
    }

    public void searchContact(String name){
        int index = findContact(name);
        if(index < 0)
            System.out.println("Contact is not in the database");
        else
            book.get(index).printContact();
    }
}
