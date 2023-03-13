package com.example.major.controller;

import com.example.major.dto.LoginDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/login")
public class LoginController {

    @PostMapping
    public LoginDTO login(@RequestBody LoginDTO loginDTO) {

        if("password".equals(loginDTO.getPassword())&& "username".equalsIgnoreCase(loginDTO.getUserName())) {
            return loginDTO;
        }
        else {
            return null;
        }
    }
}
