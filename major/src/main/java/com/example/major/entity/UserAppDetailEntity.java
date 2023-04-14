package com.example.major.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userappdetails")
public class UserAppDetailEntity {
    @Id
    @GeneratedValue
    private long id;
    private String slotsBooked;
    private String status;
    private String appType;
    private long adminId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSlotsBooked() {
        return slotsBooked;
    }

    public void setSlotsBooked(String slotsBooked) {
        this.slotsBooked = slotsBooked;
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    private long userId;
}
