package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ITelephone jokersPhone;
//        jokersPhone = new DeskPhone(123456789);
////        DeskPhone jokersPhone = new DeskPhone(123456789);
//        jokersPhone.powerOn();
//        jokersPhone.callPhone(123456789);
//        jokersPhone.answer();
//
//        jokersPhone =  new MobilePhone(1234);
//        jokersPhone.powerOn();
//        jokersPhone.callPhone(1234);
//        jokersPhone.answer();
//
        // watch for type!!
        IFirstInterface firstObj = new Demo("FromFirstInterface");
        // can't reach firstObj.writeTwice() ERROR
        firstObj.write();

        ISecondInterface secondObj = new Demo("FromSecondInterface");
        // can't reach firstObj.write() ERROR
        secondObj.writeTwice();
        ((Demo) secondObj).write(); // can be done class casting.



    }
}
