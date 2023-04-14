package com.example.major.controller;

import com.example.major.dto.AdminDetailsDto;
import com.example.major.dto.LoginDTO;
import com.example.major.entity.UserEntity;
import com.example.major.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public UserEntity login(@RequestBody LoginDTO loginDTO) {
        try {
            return userService.getUser(loginDTO);
        }
        catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN,ex.getMessage());
        }
    }
    @GetMapping("/allAdmins")
    public List<AdminDetailsDto> getAllAdmins() {
        try{
            return userService.getAllAdminUsers();
        }
        catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,ex.getMessage());
        }
    }

}
