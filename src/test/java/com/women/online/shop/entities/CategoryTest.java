package com.women.online.shop.entities;

import org.junit.Assert;
import org.junit.Test;


public class CategoryTest {
    @Test
    public void getByNumberShouldReturnFruits() {
        final Category category = Category.FRUITS;
        final Category number = Category.getByNumber(5);
        Assert.assertEquals(category, number);
    }

    @Test
    public void getByNameShouldReturnFruits() {
        final Category category = Category.FRUITS;
        final Category name = Category.getByName("FR");
        Assert.assertEquals(category, name);
    }

}