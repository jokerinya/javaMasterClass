package com.jokerinya;

public class Room {
    private String name;
    private int windowNumber;
    private CalculateVolume volume;
    private boolean light = false;

    public Room(String name, int windowNumber, CalculateVolume volume) {
        this.name = name;
        this.windowNumber = windowNumber;
        this.volume = volume;
    }

    public void lightUp () {
        light = !light;
        if (light) {
            System.out.println(this.name +  " room's Light up!");
        } else {
            System.out.println(this.name +  " room's Light down!");
        }
    }


    public int getWindowNumber() {
        return this.windowNumber;
    }

    public int getVolume() {
        return volume.getVolume();
    }

    public String getName(){
        return name;
    }
}
