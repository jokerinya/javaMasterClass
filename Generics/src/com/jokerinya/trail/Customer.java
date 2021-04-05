package com.jokerinya.trail;

public class Customer {
    private String name;
    private String lastName;
    private int ID;
    private int yearOfBirth;

    public Customer(String name, String lastName, int ID, int yearOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.ID = ID;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
