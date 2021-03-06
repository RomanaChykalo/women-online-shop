package com.women.online.shop.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "user_orders")
public class UserOrder extends AbstractEntity {
    @ManyToMany(
            mappedBy = "userOrders",
            fetch = FetchType.LAZY
    )
    private Set<Product> products = new HashSet<>();
    private double amount;
    private String city;
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    private User user;

    public UserOrder(Set<Product> products, double amount, String city) {
        this.products = products;
        this.amount = amount;
        this.city = city;
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

