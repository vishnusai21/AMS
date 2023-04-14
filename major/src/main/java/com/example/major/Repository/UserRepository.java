package com.example.major.Repository;

import com.example.major.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
UserEntity findByUserNameAndPassword(String userName, String password);
List<UserEntity> findAllByIsAdmin(boolean admin);
}

