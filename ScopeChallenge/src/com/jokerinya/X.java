package com.jokerinya;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
        x.close();

    }

    public void x(){

        for (int x = 0; x <= 12; x++) {
            System.out.println(this.x + " times " + x + " = " + x* this.x);
        }
    }
}
