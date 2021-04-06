package com.jokerinya;

public class Password {
    private static final int key = 78845678;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password){
        return password ^ key;
    }

    public void storePassword(){
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMe(int password){
        if (encryptDecrypt(password)==this.encryptedPassword){
            System.out.println("Welcome!");
            return true;
        } else {
            System.out.println("Nope you can't enter");
            return false;
        }
    }

}
