package com.jokerinya;

import java.util.Map;

public class Challenge {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.86, 50);
        stockList.addStock(temp);


        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        Basket jokersBasket = new Basket("Joker");

        System.out.println(sellItem(jokersBasket, "car", 1));
        System.out.println(jokersBasket);
        System.out.println(sellItem(jokersBasket, "car", 1));
        System.out.println(jokersBasket);

        for (StockItem item : jokersBasket.Items().keySet()){
            System.out.println(item + " Quantity--> " + item.availableQuantity()  +
                    " Reserved --> " + item.reservedInStock());
        }


//        System.out.println(jokersBasket.removeFromBasket());
        System.out.println(jokersBasket);



    }



    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkout(Basket basket){
        for (Map.Entry<StockItem, Integer> basketEntry : basket.Items().entrySet()){
            stockList.sellStock(basketEntry.getKey().getName(), basketEntry.getValue());
        }
        basket.clearBasket();
    }

}
