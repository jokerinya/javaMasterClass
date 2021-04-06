package com.jokerinya;

public class Main {

    public static void main(String[] args) {
//        StaticTest first = new StaticTest("1st Instance");
//        System.out.println(first.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest second = new StaticTest("2nd Instance");
//        System.out.println(second.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest third = new StaticTest("3rd Instance");
//        System.out.println(third.getName() + " is instance number " + StaticTest.getNumInstances());

        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        Password password = new Password(346606);
        password.storePassword();
        password.letMe(346607);
        password.letMe(346606);


    }
}
