package com.jokerinya;

public class Labrador extends Dog{
    public Labrador(String name) {
        super(name);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this){
//            return true;
//        }
//        if (obj instanceof Labrador){
//            String labradorName = ((Labrador) obj).getName();
//            return this.getName().equals(labradorName);
//        }
//
//        return false;
//    }
}
