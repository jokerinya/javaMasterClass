package com.jokerinya;

public class Basic {
    private String name;
    private String breadRoll;
    private String meat;
    private double basePrice;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;
// No Addition
    public Basic(String name, String breadRoll, String meat, double basePrice){
        this(name, breadRoll,meat,basePrice, null,null, null, null);
    }
// 1 Addition
public Basic(String name, String breadRoll, String meat, double basePrice,
                 Addition addition1){
        this(name, breadRoll,meat,basePrice, addition1, null, null, null);
    }
// 2 Addition
    public Basic(String name, String breadRoll, String meat, double basePrice,
                 Addition addition1, Addition addition2){
        this(name, breadRoll,meat,basePrice, addition1, addition2, null , null);
    }
// 3 Addition
    public Basic(String name, String breadRoll, String meat, double basePrice,
                 Addition addition1, Addition addition2, Addition addition3){
        this(name, breadRoll,meat,basePrice, addition1, addition2, addition3, null);
    }
// 4 Addition
    public Basic(String name, String breadRoll, String meat, double basePrice,
                 Addition addition1, Addition addition2, Addition addition3, Addition addition4) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basePrice = basePrice;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
    }

    public double getTotalPrice(){
        return getBasePrice() + getAdditionsPrice();
    }

    public String getAdditions(){
        String res = "";
        if (this.addition1 != null){
            res += " - " + this.addition1.getName() + ": " + this.addition1.getPrice() + "$ \n";
        }
        if (this.addition2 != null){
            res += " - " + this.addition2.getName() + ": " + this.addition2.getPrice() + "$ \n";
        }
        if (this.addition3 != null){
            res += " - " + this.addition3.getName() + ": " + this.addition3.getPrice() + "$ \n";
        }
        if (this.addition4 != null){
            res += " - " + this.addition4.getName() + ": " + this.addition4.getPrice() + "$ \n";
        }
        return res;
    }

    public double getAdditionsPrice() {
        double price1 = this.addition1 != null ? this.addition1.getPrice() : 0;
        double price2 = this.addition2 != null ? this.addition2.getPrice() : 0;
        double price3 = this.addition3 != null ? this.addition3.getPrice() : 0;
        double price4 = this.addition4 != null ? this.addition4.getPrice() : 0;
        return price1 +price2 +price3 + price4;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }
}
