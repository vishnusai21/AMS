package com.example.major.dto;

public class ApptDetailDto {
    private String availableSlots;
    private String status;
    private String appType;
    private long adminId;
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