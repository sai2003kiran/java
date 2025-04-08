package com.xworkz.passport.passportDto;

import com.xworkz.passport.Constants.CpvLocation;
import com.xworkz.passport.Constants.DcdrLocation;

public class PassportDto {
    private CpvLocation cpvLocation;
    private DcdrLocation dcdrLocation;
    private String givenName;
    private String surName;
    private String dob;
    private String emailId;
    private String emailIdSameAsLoginId;
    private String loginId;
    private String password;
    private String confirmPassword;


    public CpvLocation getCpvLocation(){
        return cpvLocation;
    }
    public void setCpvLocation(CpvLocation cpvLocation){
        this.cpvLocation = cpvLocation;
    }


    public DcdrLocation getPassPortOffice(){
        return dcdrLocation;
    }
    public void setPassPortOffice(DcdrLocation passPortOffice){
        this.dcdrLocation = passPortOffice;
    }


    public String getGivenName(){
        return givenName;
    }
    public void setGivenName(String givenName){
        this.givenName = givenName;
    }

    public String getSurName(){
        return surName;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }

    public String getDob(){
        return dob;
    }
    public void setDob(String dob){
        this.dob = dob;
    }

    public String getEmailId(){
        return emailId;
    }
    public void setEmailId(String emailId){
        this.emailId = emailId;
    }

    public String getEmailIdSameAsLoginId(){
        return emailIdSameAsLoginId;
    }
    public void setEmailIdSameAsLoginId(String emailIdSameAsLoginId){
        this.emailIdSameAsLoginId = emailIdSameAsLoginId;
    }

    public String getLoginId(){
        return loginId;
    }
    public void setLoginId(String loginId){
        this.loginId = loginId;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getConfirmPassword(){
        return confirmPassword;
    }
    public void setConfirmPassword(String confirmPassword){
        this.confirmPassword = confirmPassword;
    }


    public void setDcdrLocation(DcdrLocation dcdrLocation) {
        this.dcdrLocation = dcdrLocation;
    }
    public DcdrLocation getDcdrLocation(){
        return dcdrLocation;

    }
}
