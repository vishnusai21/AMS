package com.example.major.controller;

import com.example.major.dto.LoginDTO;
import com.example.major.entity.UserEntity;
import com.example.major.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public UserEntity login(@RequestBody LoginDTO loginDTO) {
        return userService.getUser(loginDTO);
    }
    @GetMapping("/allAdmins")
    public List<UserEntity> login() {
        return userService.getAllAdminUsers();
    }

}
