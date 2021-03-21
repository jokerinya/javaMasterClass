package com.jokerinya;

public class Healthy extends Basic{
    private Addition addition5;
    private Addition addition6;
// No additions
    public Healthy(String name, String meat, double basePrice) {
        this(name, meat, basePrice,
                null, null, null, null, null, null);
    }
// 1 additions
    public Healthy(String name, String meat, double basePrice, Addition addition1) {
        this(name, meat, basePrice, addition1,
                null, null, null, null, null);
    }
// 2 Additions
    public Healthy(String name, String meat, double basePrice, Addition addition1, Addition addition2) {
        this(name, meat, basePrice, addition1, addition2,
                null, null, null, null);
    }
// 3 Additions
    public Healthy(String name, String meat, double basePrice, Addition addition1, Addition addition2,
                   Addition addition3) {
        this(name, meat, basePrice, addition1, addition2, addition3,
                null, null, null);
    }
// 4 Additions
    public Healthy(String name, String meat, double basePrice, Addition addition1, Addition addition2,
                   Addition addition3, Addition addition4) {
        this(name, meat, basePrice, addition1, addition2, addition3, addition4,
                null, null);
    }
//5 Addition
    public Healthy(String name, String meat, double basePrice, Addition addition1, Addition addition2,
                   Addition addition3, Addition addition4, Addition addition5) {
        this(name, meat, basePrice, addition1, addition2, addition3, addition4, addition5,
                null);
    }
// 6 Addition
    public Healthy(String name, String meat, double basePrice, Addition addition1, Addition addition2,
                   Addition addition3, Addition addition4, Addition addition5, Addition addition6) {
        super(name, "Brown Rye Roll", meat, basePrice, addition1, addition2, addition3, addition4);
        this.addition5 = addition5;
        this.addition6 = addition6;
    }
    
    @Override
    public String getAdditions(){
        String res = super.getAdditions();
        if (this.addition5 != null){
            res += " - " + this.addition5.getName() + ": " + this.addition5.getPrice() + "$ \n";
        }
        if (this.addition6 != null){
            res += " - " + this.addition6.getName() + ": " + this.addition6.getPrice() + "$ \n";
        }
        return res;
    }

    @Override
    public double getTotalPrice() {
        double price5 = this.addition5 != null ? this.addition5.getPrice() : 0;
        double price6 = this.addition6 != null ? this.addition6.getPrice() : 0;
        return super.getTotalPrice() + price5 + price6;
    }

}
