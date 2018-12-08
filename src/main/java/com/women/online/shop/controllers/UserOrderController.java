package com.women.online.shop.controllers;

import com.women.online.shop.repositoties.UserOrderRepository;

public class UserOrderController {
    private final UserOrderRepository userOrderRepository;
    public UserOrderController(UserOrderRepository userOrderRepository) {
        this.userOrderRepository = userOrderRepository;
    }
}
