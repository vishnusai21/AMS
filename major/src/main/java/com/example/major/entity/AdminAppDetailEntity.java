package com.example.major.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "adminappdetails")
public class AdminAppDetailEntity {
    @Id
    @GeneratedValue
    private long id;
    private String availableSlots;
    private String status;
    private String appType;
    private long adminId;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "adminId", insertable=false, updatable=false)
    @JsonBackReference
    private UserEntity user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(String availableSlots) {
        this.availableSlots = availableSlots;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }
}
