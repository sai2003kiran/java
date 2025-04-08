package com.xworkz.bigbasketApp.bigbasketdto;

import com.xworkz.bigbasketApp.Constants.Payment;

public class BigbasketDto {
    private String name;
    private String email;
    private long phnNo;
    private Payment paymentInformation;

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

    public Payment getPaymentInformation(){
        return paymentInformation;
    }
    public void setPaymentInformation(Payment paymentInformation){
        this.paymentInformation = paymentInformation;
    }
}
