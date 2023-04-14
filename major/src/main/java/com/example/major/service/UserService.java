package com.example.major.service;

import com.example.major.Repository.AdminAppDetailRepository;
import com.example.major.Repository.UserRepository;
import com.example.major.dto.AdminDetailsDto;
import com.example.major.dto.LoginDTO;
import com.example.major.dto.UserDto;
import com.example.major.entity.AdminAppDetailEntity;
import com.example.major.entity.UserEntity;
import com.example.major.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    AdminAppDetailRepository adminAppDetailRepository;

    public UserEntity saveUser(UserDto userDto) throws Exception{
        UserEntity userEntity = MapperUtil.mapUserEntity(userDto);
        UserEntity user = userRepository.save(userEntity);
        if(userEntity.isAdmin()) {
            AdminAppDetailEntity adminAppDetailCasual = new AdminAppDetailEntity();
            adminAppDetailCasual.setAdminId(user.getId());
            adminAppDetailCasual.setAppType("CASUAL");
            adminAppDetailCasual.setStatus("ACTIVE");
            adminAppDetailCasual.setAvailableSlots("9,10,11,12,1,2,3,4,5,6");
            AdminAppDetailEntity adminAppDetailEmergency = new AdminAppDetailEntity();
            adminAppDetailEmergency.setAdminId(user.getId());
            adminAppDetailEmergency.setAppType("EMERGENCY");
            adminAppDetailEmergency.setStatus("ACTIVE");
            adminAppDetailEmergency.setAvailableSlots("9,10,11,12,1,2,3,4,5,6");
            adminAppDetailRepository.save(adminAppDetailCasual);
            adminAppDetailRepository.save(adminAppDetailEmergency);
        }
        return user;
    }

    public UserEntity getUser(LoginDTO loginDTO){
        return userRepository.findByUserNameAndPassword(loginDTO.getUserName(), loginDTO.getPassword());
    }
    public List<AdminDetailsDto> getAllAdminUsers(){
        List<UserEntity> user = userRepository.findAllByIsAdmin(true);
        return MapperUtil.mapAdminDetailsDto(user);
    }

}
