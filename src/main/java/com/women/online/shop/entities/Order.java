package com.women.online.shop.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> items = new ArrayList<>();
    private double orderAmount;
    private String cityOrder;

    public void addItem(Product item) {

        items.add(item);
    }

    public BigDecimal calculatePrice() {
        BigDecimal sum = BigDecimal.ZERO;
        for (Product item : items) {
            sum = sum.add(item.getPrice());
        }
        return sum;
    }
}

