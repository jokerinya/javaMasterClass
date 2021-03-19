package com.jokerinya;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 and 2 are operands, + is operator.
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous Result = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous Result = " + previousResult);
        result = result * 10;
        System.out.println("2 * 10 = " + result);
        result = result / 5;
        System.out.println("20 / 5 = " + result);
        result = result % 3;
        System.out.println("4 % 3 = " + result);  // modulus = remainder of operator

        /*Some Short cuts*/

        result++; // result = result + 1
        System.out.println("1 + 1 = " + result);
        result--; // result = result - 1
        System.out.println("2 - 1 = " + result);
        result += 2; // result = result + 2;
        System.out.println("1 + 2 = " + result);
        result -= 2; // result = result - 2;
        System.out.println("3 - 2 = " + result);
        result *= 10; // result = result * 2;
        System.out.println("1 * 10 = " + result);
        result /= 10; // result = result / 2;
        System.out.println("10 / 10 = " + result);

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien.");
            System.out.println("This is another line.");
        }

        int topScore = 80;
        if (topScore != 100) {
            System.out.println("You got the highest score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore>90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("New value " + newValue);
        }

        boolean isCar = false;
        /*Watch Out!!*/
//        if(isCar = true) {
        if(isCar) {
            System.out.println("This shouldn't be happen!");
        }

        boolean wasCar = isCar ? true : false;
        isCar = true;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 20;
        boolean isEigtheenOver = (ageOfClient > 18) ? true : false;
        if (isEigtheenOver)
            System.out.println("Client is over 18");

        /*Challenge*/
        System.out.println("================================================");
        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double stepThree = (myDouble + mySecondDouble) * 100.00d;  // 10000.0
        double remainder = stepThree % 40.00d;  // 0.0
        boolean isNoRemainder = (remainder == 0) ? true : false;  // true
        System.out.println("Step 4 remainder is = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
