package com.example.major.dto;

import java.util.ArrayList;
import java.util.List;

public class AdminDetailsDto {
    private String name;
    private String profession;
    private String email;
    private String phone;
    private String department;
    private Boolean admin;

    private List<ApptDetailDto> apptDetails = new ArrayList<>();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public List<ApptDetailDto> getApptDetails() {
        return apptDetails;
    }
    public void setApptDetails(List<ApptDetailDto> apptDetails) {
        this.apptDetails = apptDetails;
    }
    public Boolean getAdmin() {
        return admin;
    }
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}
