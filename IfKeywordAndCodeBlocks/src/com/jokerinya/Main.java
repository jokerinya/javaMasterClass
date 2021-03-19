package com.jokerinya;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if ((score < 5000) && (score > 1000 ) ) {
//            System.out.println("Your score is more than 1000 but smaller than 5000!");
//        } else if (score < 1000){
//            System.out.println("Smaller than 1000!");
//        } else {
//            System.out.println("More than  or equal to 5000!");
//        }
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int secondScore = score + (levelCompleted * bonus);
            System.out.println("Your second score = " + secondScore);
        }
    }
}
