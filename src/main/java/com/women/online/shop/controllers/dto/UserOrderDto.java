package com.women.online.shop.controllers.dto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
@NoArgsConstructor
@Getter
@Setter
@RestController
public class UserOrderDto {
    private String name;
    private BigDecimal price;
}
