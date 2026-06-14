package com.practice.springboot_restful_webservices.mapper;

import com.practice.springboot_restful_webservices.dto.UserDto;
import com.practice.springboot_restful_webservices.entity.User;

public class UserMapper {
    public static UserDto mapToUserDto(User user){
        //convert user jpa entity to userDto
        UserDto userDto=new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;

    }
    //convert userDto to user JPA entity
    public static User mapToUser(UserDto userDto){
        User user=new User(
               userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return user;
    }

}
