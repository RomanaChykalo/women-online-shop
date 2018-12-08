package com.women.online.shop.controllers.mappers;

import com.women.online.shop.controllers.dto.UserDto;
import com.women.online.shop.entities.Address;
import com.women.online.shop.entities.Name;
import com.women.online.shop.entities.User;

public class UserMapper {
    public static UserDto convertToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setFirstName(user.getName().getFirstName());
        userDto.setLastName(user.getName().getLastName());
        userDto.setCountry(user.getAddress().getCountry());
        userDto.setCity(user.getAddress().getCity());
        userDto.setStreet(user.getAddress().getStreet());
        userDto.setHomeNumber(user.getAddress().getHomeNumber());
        userDto.setApartment(user.getAddress().getApartment());
        return userDto;
    }

    public static User convertToEntity(UserDto userDto) {
        User user = new User();
        user.setName(new Name(userDto.getFirstName(), null, userDto.getLastName()));
        user.setAddress(
                new Address(
                        userDto.getCountry(), userDto.getCity(), userDto.getStreet(),
                        userDto.getHomeNumber(), userDto.getApartment())
        );
        return user;
    }
}
