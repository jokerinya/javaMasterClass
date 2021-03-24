package com.jokerinya;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions(){
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item on the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item on the list.");
        System.out.println("\t 7 - Process Array List.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGrocery(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter the item you want to change: ");
        String currentItem = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item removed : ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list.");
        } else {
            System.out.println(searchItem + " is not on our grocery list.");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());  //save an ArrayList to another

        ArrayList<String> newAnotherArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

    }
}
















