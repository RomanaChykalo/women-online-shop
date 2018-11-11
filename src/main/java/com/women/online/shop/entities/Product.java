package com.women.online.shop.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Product extends AbstractEntity {
    private String name;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private Country country;
    @Enumerated(EnumType.STRING)
    private Set<Category> categories = new HashSet<>();
    @ManyToMany(fetch = FetchType.LAZY)
    private Order order;

    public Product(String name, BigDecimal price, Country country, Set<Category> categories) {
        this.setName(name);
        this.setPrice(price);
        this.setCountry(country);
        this.categories.addAll(categories);
    }

    public void removeCategories(Category category) {
        if (categories.size() > 1) {
            categories.remove(category);
        }
    }
}


