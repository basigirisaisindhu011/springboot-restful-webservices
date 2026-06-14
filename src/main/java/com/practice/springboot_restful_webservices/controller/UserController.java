package com.practice.springboot_restful_webservices.controller;

import com.practice.springboot_restful_webservices.dto.UserDto;
import com.practice.springboot_restful_webservices.entity.User;
import com.practice.springboot_restful_webservices.exception.ErrorDetails;
import com.practice.springboot_restful_webservices.exception.ResourceNotFoundException;
import com.practice.springboot_restful_webservices.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {
      private UserService userService;

      //build create Rest Api
    @PostMapping
     public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto){
        UserDto savedUser= userService.createUser(userDto);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
     }
     //build get user by id rest api
    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId){
        UserDto user=userService.getUserById(userId);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers(){
        List<UserDto>  users= userService.getAllUsers();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<UserDto> updateUser(@Valid@PathVariable("id") Long userId,@RequestBody UserDto user){
        user.setId(userId);
       UserDto updatedUser= userService.updateUser(user);
       return new ResponseEntity<>(updatedUser,HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted",HttpStatus.OK);

    }
//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<ErrorDetails> handleResourceNtFoundException(ResourceNotFoundException exception, WebRequest webRequest){
//        String errorCode;
//        ErrorDetails errorDetails=new ErrorDetails(
//              LocalDateTime.now(),
//                exception.getMessage(),
//                webRequest.getDescription(false),
//                "USER_NOT_FOUND"
//        );
//        return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
//    }


}
