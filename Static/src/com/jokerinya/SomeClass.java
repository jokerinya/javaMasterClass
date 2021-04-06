package com.jokerinya;

public class SomeClass {
    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        this.instanceNumber = classCounter;
        System.out.println(this.name + " created, instance is " + this.instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
