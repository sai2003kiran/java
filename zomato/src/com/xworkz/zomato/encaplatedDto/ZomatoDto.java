package com.xworkz.zomato.encaplatedDto;

import com.xworkz.zomato.constants.Gender;

public class ZomatoDto {
    private String username;
    private String email;
    private String phoneNumber;
    private String password;
    private Gender gender;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getUserName() {
        return username;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}