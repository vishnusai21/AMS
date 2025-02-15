package com.example.major.controller;

import com.example.major.dto.UserDto;
import com.example.major.entity.UserEntity;
import com.example.major.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/user/signup")
public class SignUpController {
    @Autowired
    UserService userService;
    @PostMapping
    public UserEntity signup(@RequestBody UserDto userDto ) {
        try {
            return userService.saveUser(userDto);
        }
        catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }

    }
}
