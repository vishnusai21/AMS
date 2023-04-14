package com.example.major.controller;

import com.example.major.Entity.UserEntity;
import com.example.major.dto.UserDto;
import com.example.major.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserSignup")
public class SignUpController {
    @Autowired
    UserService userService;
    @PostMapping
    public UserEntity signup(@RequestBody UserDto userDto ) throws Exception{
       return userService.saveUser(userDto);
    }
}
