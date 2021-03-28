package com.jokerinya;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clucthIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for (int i = 1; i < maxGears; i++) {
            addGear(i, i*5.3);
        }
    }

    public void operateClucth (boolean in){
        this.clucthIn = in;
    }

    private void addGear(int number, double ration){
        if (number>0 && number<= this.maxGears){
            this.gears.add(new Gear(number, ration));
        }
    }

    public void changeGear(int newGear){
        if (newGear>=0 && newGear<this.gears.size() && this.clucthIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " gear selected.");
        } else {
            System.out.println("Grind");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if (clucthIn){
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * this.gears.get(currentGear).getRatio();
    }

    private class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs * this.ratio;
        }

        public double getRatio() {
            return ratio;
        }
    }
}
