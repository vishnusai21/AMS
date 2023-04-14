package com.example.major.controller;

import com.example.major.dto.LoginDTO;
import com.example.major.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping
    public Boolean login(@RequestBody LoginDTO loginDTO) {
        return userService.getUser(loginDTO);
    }

}
