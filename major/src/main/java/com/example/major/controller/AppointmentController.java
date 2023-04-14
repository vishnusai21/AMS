package com.example.major.controller;

import com.example.major.dto.BookApptDto;
import com.example.major.entity.UserAppDetailEntity;
import com.example.major.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/user")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/book/appointment")
    public UserAppDetailEntity bookAppointment(@RequestBody BookApptDto bookApptDto) {
        try {
            return appointmentService.bookAppointment(bookApptDto);
        }
        catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,ex.getMessage());
        }
    }

}
