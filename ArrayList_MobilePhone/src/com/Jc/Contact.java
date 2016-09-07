package com.Jc;

/**
 * Created by priyaranjanjc on 9/6/2016.
 */
public class Contact {
    private String name;
    private String phoneNo;

    public Contact(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }

    private String getName() {
        return name;
    }

    private String getPhoneNo() {
        return phoneNo;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public boolean checkName(String searchName){
        if(searchName.equals(getName())){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkNumber(String number){
        if(getPhoneNo().equals(number)){
            return true;
        }
        else
            return false;
    }

    public boolean updateName(String newName){
        if(getName().equals(newName)){
            System.out.println("Name of the contact is already as you desired");
            return false;
        }
        else{
            setName(newName);
            return true;
        }
    }

    public boolean updateNumber(String Number){
        if(getPhoneNo().equals(Number)){
            System.out.println("Number is already up to date");
            return false;
        }
        else{
            setPhoneNo(Number);
            return true;
        }
    }

    public void printContact(){
        System.out.println(getName()+" - "+getPhoneNo());
    }
}
