package com.women.online.shop.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Order extends AbstractEntity {
    @ManyToMany(
            mappedBy = "order",
            fetch = FetchType.EAGER
    )
    private List<Product> products = new ArrayList<>();
    private double orderAmount;
    private String cityOrder;
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    private User user;

    public Order(List<Product> products, double orderAmount, String cityOrder) {
        this.products = products;
        this.orderAmount = orderAmount;
        this.cityOrder = cityOrder;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public BigDecimal calculatePrice() {
        BigDecimal sum = BigDecimal.ZERO;
        for (Product product : products) {
            sum = sum.add(product.getPrice());
        }
        return sum;
    }
}

