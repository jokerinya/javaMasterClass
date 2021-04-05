package com.jokerinya.trail;

public abstract class BaseCustomerManager extends Customer implements Savable {
    public BaseCustomerManager(String name, String lastName, int ID, int yearOfBirth) {
        super(name, lastName, ID, yearOfBirth);
    }

    @Override
    public void save() {
        System.out.println("Saved to DB: " + this.getName());
    }
}
