package com.example.major.Repository;

import com.example.major.entity.AdminAppDetailEntity;
import com.example.major.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminAppDetailRepository extends JpaRepository<AdminAppDetailEntity, Long> {
}

