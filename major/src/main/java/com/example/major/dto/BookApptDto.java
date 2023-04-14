package com.example.major.dto;

public class BookApptDto {
    private long userId;
    private long adminId;
    private String slotBooked;
    private String appType;
    private String status;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public String getSlotBooked() {
        return slotBooked;
    }

    public void setSlotBooked(String slotBooked) {
        this.slotBooked = slotBooked;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
