package com.jokerinya;

import java.util.Objects;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock;
    private int reserved;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
        this.reserved = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
        this.reserved = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public int availableQuantity() {
        return quantityStock - reserved;
    }

    public int reservedInStock() {
        return this.reserved;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    public void adjustStock(int quantity) {
        int newQuantity = (this.quantityStock + quantity);
        if (newQuantity >= 0) {
            this.quantityStock = newQuantity;
        }
    }

    public int reserveStock(int quantity){
        if (quantity <= availableQuantity()){
            reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unreserveStock(int quantity){
        if (quantity <= this.reserved){
            this.reserved -= quantity;
            return this.reserved;
        }
        return 0;
    }

    public int finalizeStock(int quantity){
        if (quantity <= this.reserved){
            this.quantityStock -= quantity;
            this.reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Entering StockItem.equals");
        if (this == o) return true;  // same
        if (o == null || getClass() != o.getClass()) return false; // null or not same class
        StockItem stockItem = (StockItem) o; // now check something
        return this.name.equals(stockItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name) + 31;
    }

    @Override
    public int compareTo(StockItem o) {
//        System.out.println("Entering StockItem.compareTo");
        if (this == o) return 0;
        if (o != null) return this.name.compareTo(o.getName());
        // For null o throw an error
        throw new NullPointerException();

    }

    @Override
    public String toString() {
        return this.name + " : price = " + this.price + " .Reserved " + this.reserved;
    }
}
