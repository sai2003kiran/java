package com.xworkz.airbnbApp.airbnbdto;

import com.xworkz.airbnbApp.Constants.Payment;

import java.util.prefs.Preferences;

public class AirbnbDto {
    private String name;
    private String email;
    private long phnNo;
    private Preferences travelType;
    private Payment paymentType;

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

    public Preferences getTravelType(){
        return travelType;
    }
    public void setTravelType(Preferences travelType){
        this.travelType = travelType;
    }

    public Payment getPaymentType(){
        return paymentType;
    }
    public void setPaymentType(Payment paymentType){
        this.paymentType = paymentType;
    }

    public void setTravelType(com.xworkz.airbnbApp.Preferences preferences) {
    }
}
