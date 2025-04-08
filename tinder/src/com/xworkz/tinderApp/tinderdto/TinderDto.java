package com.xworkz.tinderApp.tinderdto;

import com.xworkz.tinderApp.Constants.Gender;

public class TinderDto {
    private String name;
    private String email;
    private long phnNo;
    private Gender gender;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public long getPhnNo(){
        return phnNo;
    }
    public void setPhnNo(long phnNo){
        this.phnNo = phnNo;
    }

    public Gender getGender(){
        return gender;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }
}
