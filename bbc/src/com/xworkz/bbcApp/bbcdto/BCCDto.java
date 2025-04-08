package com.xworkz.bbcApp.bbcdto;

import com.xworkz.bbcApp.Constants.News;

public class BCCDto {
    private String name;
    private String email;
    private long phnNo;
    private News preferences;

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

    public News getPreferences(){
        return preferences;
    }
    public void setPreferences(News preferences){
        this.preferences = preferences;
    }
}
