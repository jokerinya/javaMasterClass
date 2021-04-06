package com.demoSeries;

public class Main {

    public static void main(String[] args) {
        String varFour = "this is private to main()";
        ScopeCheck scopeInstance = new ScopeCheck();
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        System.out.println("here we cant reach `private varThree` " + innerClass.varThree);


//        System.out.println(" scopeInstance varOne is " + scopeInstance.getVarOne());
//        System.out.println(varFour);
//        System.out.println("**********************************");
//        scopeInstance.timesTwo();
//        System.out.println("**********************************");
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();
    }


}
