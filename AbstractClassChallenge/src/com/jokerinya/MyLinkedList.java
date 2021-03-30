package com.jokerinya;

public class MyLinkedList implements NodeList{

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root==null){
            // the list is empty
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison<0){
                // newitem is greater, move to left
                if (currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    // there is no left so insert at the end of the list
                    // currentItem.setNext(newItem); // returns newItem
                    // newItem.setPrevious(currentItem);
                    // short way because setNext(item) and setPrevious(item) returns "item"
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison>0) {
                // newitem is smaller move to left
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // reached the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already on the list.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null){
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(item);
            if (comparison==0){
                // found the item to delete
                if (currentItem == this.root){
                    this.root = currentItem.next();
                } else {
                    // we know currentItem has a previous
                    currentItem.previous().setNext(currentItem.next());
                    // but not sure if there is next element
                    if (currentItem.next()!= null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison<0){
                currentItem = currentItem.next();
            } else {
                // the item is not on the list
                return false;
            }
        }
        // end of the list, couldn't find the item
        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if (root == null){
            System.out.println("The list is empty.");
        } else{
            while (root!=null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
