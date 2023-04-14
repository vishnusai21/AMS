package com.example.major.dto;

import java.util.List;

public class UserDto {
   private String name;
    private String profession;
    private String email;
    private String phone;
    private String userName;
    private String password;
    private String department;
    private boolean admin;

    public List<AdminDetailsDTO> getAdminDetails() {
        return adminDetails;
    }

    public void setAdminDetails(List<AdminDetailsDTO> adminDetails) {
        this.adminDetails = adminDetails;
    }

    private List<AdminDetailsDTO> adminDetails;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }



}
