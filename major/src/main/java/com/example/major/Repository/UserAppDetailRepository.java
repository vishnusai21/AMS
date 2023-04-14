package com.example.major.Repository;

import com.example.major.entity.UserAppDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAppDetailRepository extends JpaRepository<UserAppDetailEntity, Long> {
}

