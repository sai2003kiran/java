package com.xworkz.youtubeApp.youtubedto;

import com.xworkz.youtubeApp.Constants.Subcribtion;

public class YouTubeDto {
    private String name;
    private String email;
    private long phnNo;
    private String password;
    private Subcribtion subcribtion;

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

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public Subcribtion getSubcribtion(){
        return subcribtion;
    }
    public void setSubcribtion(Subcribtion subcribtion){
        this.subcribtion = subcribtion;
    }
}
