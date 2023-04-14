package com.example.major.util;

import com.example.major.dto.AdminDetailsDto;
import com.example.major.dto.ApptDetailDto;
import com.example.major.dto.BookApptDto;
import com.example.major.dto.UserDto;
import com.example.major.entity.UserAppDetailEntity;
import com.example.major.entity.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

public class MapperUtil {

    public static List<AdminDetailsDto> mapAdminDetailsDto(List<UserEntity> user) {
        List<AdminDetailsDto> result = user.stream().map(temp -> {
            AdminDetailsDto adminDetailsDto=new AdminDetailsDto();
            adminDetailsDto.setAdmin(temp.isAdmin());
            adminDetailsDto.setDepartment(temp.getDepartment());
            adminDetailsDto.setEmail(temp.getEmail());
            adminDetailsDto.setPhone(temp.getPhone());
            adminDetailsDto.setName(temp.getName());
            adminDetailsDto.setProfession(temp.getProfession());
            adminDetailsDto.setApptDetails(temp.getApptDetails().stream().map(appt->{
                ApptDetailDto apptDetailDto = new ApptDetailDto();
                apptDetailDto.setAdminId(appt.getAdminId());
                apptDetailDto.setAvailableSlots(appt.getAvailableSlots());
                apptDetailDto.setAppType(appt.getAppType());
                apptDetailDto.setStatus(appt.getStatus());
                return apptDetailDto;
            }).collect(Collectors.toList()));
            return adminDetailsDto;
        } ).collect(Collectors.toList());
        return result;
    }

    public static UserEntity mapUserEntity(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(userDto.getUserName());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setName(userDto.getName());
        userEntity.setPassword(userDto.getPassword());
        userEntity.setDepartment(userDto.getDepartment());
        userEntity.setPhone(userDto.getPhone());
        userEntity.setAdmin(userDto.isAdmin());
        userEntity.setProfession(userDto.getProfession());
        return userEntity;
    }

    public static UserAppDetailEntity mapAppointmentBooking(BookApptDto bookApptDto) {
        UserAppDetailEntity userAppDetailEntity = new UserAppDetailEntity();
        userAppDetailEntity.setAppType(bookApptDto.getAppType());
        userAppDetailEntity.setSlotsBooked(bookApptDto.getSlotBooked());
        userAppDetailEntity.setUserId(bookApptDto.getUserId());
        userAppDetailEntity.setStatus("BOOKED");
        userAppDetailEntity.setAdminId(bookApptDto.getAdminId());
        return userAppDetailEntity;
    }
}
