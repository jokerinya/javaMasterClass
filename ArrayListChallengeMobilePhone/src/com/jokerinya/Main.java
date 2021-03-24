package com.jokerinya;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO PHONEBOOK");
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        MobilePhone mobilePhone = new MobilePhone(name);
        mobilePhone.printMenu();
        boolean quit = false;
        int entry;
        while (!quit){
            System.out.println(mobilePhone.getName() + ", Press 6 to Print Phone Menu.");
            if (scanner.hasNextInt()) {
                entry = scanner.nextInt();
                scanner.nextLine();

                switch (entry){
                    case 0:
                        System.out.println("Thank you.");
                        quit = true;
                        break;
                    case 1:
                        mobilePhone.printPhoneBook();
                        break;
                    case 2:
                        mobilePhone.addContact();
                        break;
                    case 3:
                        mobilePhone.modifyContact();
                        break;
                    case 4:
                        mobilePhone.removeContact();
                        break;
                    case 5:
                        mobilePhone.searchContact();
                        break;
                    case 6:
                        mobilePhone.printMenu();
                        break;
                    default:
                        System.out.println("Invalid Entry, please press 0 for quit.");
                        break;
                }
            } else {
                System.out.println("Invalid Entry");
                scanner.nextLine();
            }

        }


        scanner.close();
    }
}
