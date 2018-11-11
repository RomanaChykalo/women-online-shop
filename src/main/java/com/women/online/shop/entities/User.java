package com.women.online.shop.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User extends AbstractEntity {
    private Name name;
    private String email;
    private LocalDate dateOfBirth;
    private Address address;
    private PhoneNumber phones;
    private List<Order> orders = new ArrayList<>();
    private List<Category> favouriteCategories = new ArrayList<>();

    public User(Name name, String email, LocalDate dateOfBirth, Address address, PhoneNumber phones, List<Order> orders) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phones = phones;
        this.orders = orders;
    }

    public void addCategory(Category category) {
        favouriteCategories.add(category);
    }

    public void removeCategory(Category category) {
        favouriteCategories.remove(category);
    }

    public void removeCategories() {
        favouriteCategories.clear();
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                ", phones=" + phones +
                ", orders=" + orders +
                ", favouriteCategories=" + favouriteCategories +
                '}';
    }
}
