package com.jokerinya;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            int inBasket = this.list.getOrDefault(item, 0);
            list.put(item, (quantity + inBasket));
            return inBasket;
        }
        return 0;
    }

    public int removeFromBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            int inBasket = this.list.getOrDefault(item, 0); // item.value or 0 will be returned
            int newQuantity = inBasket - quantity;

            if (newQuantity > 0 ){
                list.put(item, newQuantity);
                return newQuantity;
            } else if (newQuantity == 0){
                list.remove(item);
                return quantity;
            }
        }
        return 0;
    }

    public void clearBasket(){
        this.list.clear(); // faster..
    }




    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(this.list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + " items\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
