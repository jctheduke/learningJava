package com.Jc;

import java.util.ArrayList;

/**
 * Created by priyaranjanjc on 8/27/2016.
 */
public class MobilePhone {

    public MobilePhone() {
    }

    private static ArrayList<Contact> contacts = new ArrayList<Contact>();

    public static ArrayList<Contact> getContacts() {
        return contacts;
    }

    public static void storeContact(Contact contact) {
        int position = findContact(contact);
        if (position < 0) {
            contacts.add(contact);
        } else
            System.out.println("Contact already present");

    }

    private static int findContact(Contact contact) {
        return contacts.indexOf(contact);
    }


    public static void removeContact(Contact contact) {
        int position = findContact(contact);

        if (position >= 0)
            contacts.remove(position);
        else
            System.out.println("Contact is not in the list");
    }

    public static Contact searchContact(String name, int flag) {

        for (int i = 0; i < contacts.size(); i++) {
            if (flag == 0) {
                if (name == contacts.get(i).getName()) {
                    return contacts.get(i);
                }
            } else if (flag == 1) {
                if (name == contacts.get(i).getPhoneNumber()) {
                    return contacts.get(i);
                }
            } else {
                System.out.println("Give correct Input");
                break;
            }

        }
        System.out.println("given name not in the contact list");
        return null;
    }

    // add modify contact method
  Integer
}
