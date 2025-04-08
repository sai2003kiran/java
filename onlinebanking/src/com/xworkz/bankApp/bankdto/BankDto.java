package com.xworkz.bankApp.bankdto;

import com.xworkz.bankApp.Constants.Account;

public class BankDto {
    private String name;
    private String email;
    private long phnNo;
    private Account accountType;

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

    public Account getAccountType(){
        return accountType;
    }
    public void setPaymentInformation(Account accountType){
        this.accountType = accountType;
    }
}
