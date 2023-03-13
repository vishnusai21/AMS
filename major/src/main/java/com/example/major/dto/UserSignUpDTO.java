package com.example.major.dto;

public class UserSignUpDTO {
    private String FirstName;
    private String LastName;
    private int MobileNum;
    private String eMail;
    private String Address;
    private String Hno;
    private String Street;
    private String Area;
    private String City;
    private String State;
    private int PinCode ;
    private String userName;
    private String password;
    private String ConfirmPassword;

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getMobileNum() {
        return MobileNum;
    }

    public String geteMail() {
        return eMail;
    }

    public String getAddress() {
        return Address;
    }

    public String getHno() {
        return Hno;
    }

    public String getStreet() {
        return Street;
    }

    public String getArea() {
        return Area;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public int getPinCode() {
        return PinCode;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setMobileNum(int mobileNum) {
        MobileNum = mobileNum;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setHno(String hno) {
        Hno = hno;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public void setArea(String area) {
        Area = area;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setState(String state) {
        State = state;
    }

    public void setPinCode(int pinCode) {
        PinCode = pinCode;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }
}
