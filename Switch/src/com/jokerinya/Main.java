package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int value = 1;
        if(value == 1){
            System.out.println("Value was 1");
        } else if(value ==2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Switch value is 1");
                break;
            case 2:
                System.out.println("Switch value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("3 or 4 or 5");
                break;
            default:
                System.out.println("Neither 2 nor 1");
                break;
        }

        /*Challenge*/
        char myChar = 'A';
        switch (myChar){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Your value is " + myChar);
                break;
            default:
                System.out.println("Not A,B,C,D,E.");
                break;
        }
    }
}
