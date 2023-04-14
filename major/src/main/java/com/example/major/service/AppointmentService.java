package com.example.major.service;

import com.example.major.Repository.AdminAppDetailRepository;
import com.example.major.Repository.UserAppDetailRepository;
import com.example.major.dto.BookApptDto;
import com.example.major.entity.AdminAppDetailEntity;
import com.example.major.entity.UserAppDetailEntity;
import com.example.major.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class AppointmentService {
    @Autowired
    AdminAppDetailRepository adminAppDetailRepository;

    @Autowired
    UserAppDetailRepository userAppDetailRepository;

    public UserAppDetailEntity bookAppointment(BookApptDto bookApptDto) {
        AdminAppDetailEntity detailEntity = adminAppDetailRepository.findByAdminIdAndAppType(bookApptDto.getAdminId(), bookApptDto.getAppType());
        String slots = detailEntity.getAvailableSlots();
        if(!slots.contains("," + bookApptDto.getSlotBooked() + ",")) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Slot "+bookApptDto.getSlotBooked()+" is not available. Please try booking another slot");
        }
        slots = slots.replace(","+bookApptDto.getSlotBooked()+",",",");
        detailEntity.setAvailableSlots(slots);
        adminAppDetailRepository.save(detailEntity);
        UserAppDetailEntity userAppDetailEntity = MapperUtil.mapAppointmentBooking(bookApptDto);
        return userAppDetailRepository.save(userAppDetailEntity);
    }

}
