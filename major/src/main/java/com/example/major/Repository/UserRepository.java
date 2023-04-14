package com.example.major.Repository;

import com.example.major.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
UserEntity findByUserNameAndPassword(String userName, String password);
}

