package com.xworkz.linkedinApp.linkdindto;

import com.xworkz.linkedinApp.Constants.Education;
import com.xworkz.linkedinApp.Constants.Software;

public class LinkdinDto {
    private String name;
    private String email;
    private long phnNo;
    private Software softwareskills;
    private Education eduaction;

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

    public Software getSoftwareskills(){
        return softwareskills;
    }
    public void setSoftwareskills(Software softwareskills){
        this.softwareskills = softwareskills;
    }

    public Education getEduaction(){
        return eduaction;
    }
    public void setEduaction(Education eduaction){
        this.eduaction = eduaction;
    }
}
