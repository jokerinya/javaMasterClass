package com.jokerinya;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus); // both way is valid
        System.out.println("Your final score was " + highScore);


        displayHighScorePosition("Max", calculateHighScorePosition(1500));
        displayHighScorePosition("Jo", calculateHighScorePosition(900));
        displayHighScorePosition("Ken", calculateHighScorePosition(400));
        displayHighScorePosition("Ryu", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;  // -1 generally a thing for used this kind of situations.
    }



    /*Challenge */

    public static int calculateHighScorePosition (int score) {
        int data = 4;
        if (score >= 1000) {
            data = 1;
        } else if (score >= 500){
            data = 2;
        } else if (score >= 100);{
            data = 3;
        }
        return data;
    }

    public static void displayHighScorePosition (String name, int position){
        System.out.println(name + " managed to get into the position "
                                + position
                                + " on the high score table.");
    }
}
