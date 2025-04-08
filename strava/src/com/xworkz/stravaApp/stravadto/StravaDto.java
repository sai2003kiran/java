package com.xworkz.stravaApp.stravadto;

import com.xworkz.stravaApp.Constants.Gender;

public class StravaDto {
    private String name;
    private String email;
    private long phnNo;
    private Gender gender;
    private int age;

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

    public int getAge(){
        return  age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
