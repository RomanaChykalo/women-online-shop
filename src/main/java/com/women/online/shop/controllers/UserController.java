package com.women.online.shop.controllers;

import com.women.online.shop.controllers.dto.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping("/users")
    public void create(@RequestBody UserDto user) {
            System.out.println(user);
    }
}
