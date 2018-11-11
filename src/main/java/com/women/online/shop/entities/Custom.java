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
public class Custom extends AbstractEntity {
    @ManyToMany(
            mappedBy = "customs",
            fetch = FetchType.LAZY
    )
    private List<Product> products = new ArrayList<>();
    private double amount;
    private String city;
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    private User user;

    public Custom(List<Product> products, double amount, String city) {
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

