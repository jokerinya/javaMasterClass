package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Joker", 500);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(12));
        System.out.println(calcFeetAndInchesToCentimeters(1000));
        System.out.println(calcFeetAndInchesToCentimeters(25));
        System.out.println(calcFeetAndInchesToCentimeters(6,3));

    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score*1000;
    };
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points.");
        return score*1000;
    };
    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    };

    /*Challenge*/
    public static double calcFeetAndInchesToCentimeters(double feet, double inch){
        if(feet < 0 || (inch<0 || inch > 12)){
            return -1;
        };
        double newInch = (feet * 12) + inch;
        double cm = newInch * 2.54;
        System.out.println(feet + " feet "+ inch + " inches = " + cm + " cm.");
        return cm;
    }
    public static double calcFeetAndInchesToCentimeters(double inch){
        if(inch<0){
            return -1;
        };
        double feet = (int) inch / 12;
        System.out.println("feet " + feet);
        double newInch = (int) inch % 12;
        return calcFeetAndInchesToCentimeters(feet,newInch);
    };
}
