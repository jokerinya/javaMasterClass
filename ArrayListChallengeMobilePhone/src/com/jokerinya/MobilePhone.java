package com.jokerinya;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Contact> phoneBook;
    private String name;

    public MobilePhone(String name) {
        this.phoneBook = new ArrayList<Contact>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Print Menu
    public void printMenu(){
        System.out.println("\nPress: ");
        System.out.println("\t 1 - To print the phonebook.");
        System.out.println("\t 2 - To add a contact to phonebook.");
        System.out.println("\t 3 - To modify a contact on phonebook.");
        System.out.println("\t 4 - To remove a contact from phonebook.");
        System.out.println("\t 5 - To search for a contact on phonebook.");
        System.out.println("\t 0 - To quit the application.");
    }
// Add
    public void addContact(){
        System.out.print("Please enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter the phone number: ");
        String number = scanner.nextLine();
        if (isValid(name) && isValid(number)) {
            if (searchContact(name) == -1){ // no record with provided name
                addContact(name, number);
            } else {
                System.out.println("Aborted! There is already an entry with the same name.");
            }
        }
    }
    private void addContact(String name, String number){
        boolean res =  this.phoneBook.add(new Contact(name, number));
        if (res) {
            System.out.println("Your contact has been recorded: "+ name + " - " + number);
        } else {
            System.out.println("Couldn't record some problem occurred. ");
        }
    }
// Print
    public void printPhoneBook(){
        System.out.println("You have " + this.phoneBook.size() + " contacts in your list.");
        for (int i = 0; i < this.phoneBook.size(); i++) {
            Contact contact = this.phoneBook.get(i);
            System.out.println((i+1) + ". " + contact.getName() + " - " + contact.getNumber());
        }
    }
// Search
    public void searchContact(){
        System.out.print("Search name : ");
        String name = scanner.nextLine();
        if (!name.equals("")){
            if (searchContact(name) >= 0){
                Contact contact = this.phoneBook.get(searchContact(name));
                System.out.println("Record found: " + contact.getName() + " - " + contact.getNumber());
            } else {
                System.out.println("Couldn't found " + name);
            }
        } else {
            System.out.println("You haven't entered any value.");
        }
    }
    private int searchContact(String name){
        int index = -1;
//        finds index of the contact and returns it or -1
        for (int i = 0; i < this.phoneBook.size(); i++) {
            if (this.phoneBook.get(i).getName().equals(name)) {
                index = i;
                break;
            }
        }
        return index;
    }
// Remove
    public void removeContact(){
        System.out.print("Enter the name of contact you want to delete: ");
        String name = scanner.nextLine();
        if (isValid(name)){
            int index = searchContact(name);
            if (index>=0){
                removeContact(index);
            } else {
                System.out.println("Couldn't find the value.");
            }
        }

    }
    private void removeContact(int index) {
        Contact oldValue =  this.phoneBook.remove(index);
        System.out.println("Contact deleted. Was: " + oldValue.getName() + " - " +oldValue.getNumber());
    }
// Modify
    public void modifyContact(){
        System.out.print("Enter the name you want to modify: ");
        String name = scanner.nextLine();
        if (isValid(name)){
            int index = searchContact(name);
            if (index>=0){
                modifyContact(index);
            } else {
                System.out.println("Couldn't find the record: " + name);
            }
        }
    }
    private void modifyContact(int index){
        Contact contact = this.phoneBook.get(index);
        System.out.println("Record is: " + contact.getName() + " - " + contact.getNumber());
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new number: ");
        String newNumber = scanner.nextLine();
        if (isValid(newName) && isValid(newNumber)) {
            contact.setName(newName);
            contact.setNumber(newNumber);
            System.out.println("Record modified: " + contact.getName() + " - " +contact.getNumber());
        }
    }
// Check Empty Input
    private boolean isValid(String name) {
        if (!name.equals("")){
            return true;
        } else {
            System.out.println("You haven't enter any value.");
            return false;
        }
    }

}
