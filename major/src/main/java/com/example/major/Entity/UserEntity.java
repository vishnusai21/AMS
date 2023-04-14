package com.example.major.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;
import java.util.*;

@Entity
@Table(name = "user")
public class UserEntity {

    private String name;
    @Id
    @GeneratedValue
    private long id;
    private String profession;
    private String email;
    private String phone;
    private String userName;
    private String password;
    private String department;
    private boolean isAdmin;
//    private Timestamp createdDate;
//
//    public Timestamp getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Timestamp createdDate) {
//        this.createdDate = createdDate;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return isAdmin == that.isAdmin && Objects.equals(name, that.name) && Objects.equals(id, that.id) && Objects.equals(profession, that.profession) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && Objects.equals(userName, that.userName) && Objects.equals(password, that.password) && Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, profession, email, phone, userName, password, department, isAdmin);
    }
}
