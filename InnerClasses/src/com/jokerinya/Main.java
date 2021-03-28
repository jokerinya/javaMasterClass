package com.jokerinya;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        // This inner class implements an interface inside of the Button class
        // Above Button class instance crated and named as btnPrint
        // Below this class must have a onClick(String varName) method.
        class ClickListener implements Button.OnClickListener {
            public ClickListener(){
                System.out.println("I have been attached.");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        }
        // Button instance btnPrint, must has a OnClickListener interface class for onClickListener field,
        // Otherwise btn.onClick() throws an error.
        // Here after setting onClickListener, btnPrint.onClick() implements onClickListener's (this new created
        // ClickListener class' onClick() method.
        btnPrint.setOnClickListener(new ClickListener());

        // Anonymous Class
        // btnPrint.setOnClickListener(new Button.OnClickListener() {
        //     @Override
        //     public void onClick(String title) {
        //         System.out.println("something");
        //     }
        // });
        listen(); // to simulate clicking print button.

    }
    private static void listen(){
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }

    //        Gearbox mcLaren = new Gearbox(6);
    //        mcLaren.operateClucth(true);
    //        mcLaren.changeGear(1);
    //        mcLaren.operateClucth(false);
    //        System.out.println(mcLaren.wheelSpeed(1000));
    //        mcLaren.operateClucth(true);
    //        mcLaren.changeGear(2);
    //        mcLaren.operateClucth(false);
    //        System.out.println(mcLaren.wheelSpeed(2000));
    //        mcLaren.operateClucth(true);
    //        mcLaren.changeGear(3);
    //        mcLaren.operateClucth(false);
    //        System.out.println(mcLaren.wheelSpeed(3000));


}
