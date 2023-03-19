package com.example.major.controller;

import com.example.major.dto.UserSignUpDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserSignup")
public class SignUpController {
    @PostMapping
    public UserSignUpDTO signup(@RequestBody UserSignUpDTO userSignUpDTO ){
        return userSignUpDTO;
    }
}
