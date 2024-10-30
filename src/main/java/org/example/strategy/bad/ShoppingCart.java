package org.example.strategy.bad;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public int totalAmount() {
        return items.stream().map(Item::getPrice).mapToInt(Integer::intValue).sum();
    }

    public static class Item {
        private int price;

        public Item(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }
}