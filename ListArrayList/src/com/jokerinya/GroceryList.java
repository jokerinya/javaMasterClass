package com.jokerinya;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGrocery(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". item = " + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position>=0) {
            modifyGroceryItem(position, newItem);
        } else {
            System.out.println("Couldn't find the item check your spelling.");
        }
    }
    private void modifyGroceryItem(int index, String newItem){
        groceryList.set(index, newItem);
        System.out.println("Grocery item at " + (index+1) + " has been modified.");
    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position>=0){
            removeGroceryItem(position);
        } else {
            System.out.println("Couldn't find the item check your spelling.");
        }
    }
    private void removeGroceryItem(int index){
        String theItem = groceryList.get(index);
        groceryList.remove(index);
        System.out.println(theItem + " removed from the list.");
    }
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String seachItem){
        int position = findItem(seachItem);
        return position >= 0;
    }

}
