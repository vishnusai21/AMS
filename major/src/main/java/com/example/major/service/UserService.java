package com.example.major.service;

import com.example.major.Entity.UserEntity;
import com.example.major.Repository.UserRepository;
import com.example.major.dto.LoginDTO;
import com.example.major.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserEntity saveUser(UserDto userDto) throws Exception{
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(userDto.getUserName());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setName(userDto.getName());
        userEntity.setPassword(userDto.getPassword());
        userEntity.setDepartment(userDto.getDepartment());
        userEntity.setPhone(userDto.getPhone());
        userEntity.setProfession(userDto.getProfession());
        UserEntity user = userRepository.save(userEntity);
        return user;
    }
    public Boolean getUser(LoginDTO loginDTO){
    UserEntity user =userRepository.findByUserNameAndPassword(loginDTO.getUserName(), loginDTO.getPassword());
    if(user ==null)
        return false;
    else
        return true;
    }
}
