package com.xworkz.alibaba;

import com.xworkz.alibaba.data.Data;

public class ValidationDto {
    Data dto;
    public boolean validation(Data data){
        boolean  verify = false;
        boolean  isFullName=false;
        boolean  isDob=false;
        boolean  isEmail=false;
        boolean  isConformEmail=false;
        boolean  isPassword=false;
        boolean  isConformPassword=false;

        if (data.getFullName()!= null && data.getFullName().length()>3) {
            isFullName=true;
        } else System.out.println("invalid fullName");

        if (data.getDob()!= null && data.getDob().length()>6) {
            isDob=true;
        }else System.out.println("invalid Dob");

        if (data.getEmail()!= null && !data.getEmail().isEmpty() && data.getEmail().length()>8) {
            isEmail=true;
        }else System.out.println("invalid Email");

        if (data.getEmail() == data.getConformEmail()) {
            isConformEmail=true;
        }else System.out.println("misMatching email");

        if (data.getPassword() != null && !data.getPassword().isEmpty() && data.getPassword().length()>6) {
            isPassword=true;
        } else System.out.println("invalid Password");

        if (data.getPassword() == data.getConformPassword()){
            isConformPassword=true;
        } else System.out.println("MisMatch Password");
        if (isFullName && isDob && isEmail && isConformEmail && isPassword && isConformPassword) {
            verify = true;
        } else System.out.println("the data is incorrect");
        return verify;
    }

    public void userprofile(Data data){
        boolean Valid = validation(data);
        boolean verify = false;
        if (Valid) {
            verify=true;
            dto = data;
        }else System.out.println("user registeration is unSuccessful");
    }

    public void fetchDetails(){
        System.out.println("full name is : "+dto.getFullName());
        System.out.println("Dob is : "+dto.getDob());
        System.out.println("email is : "+dto.getEmail());
        System.out.println("SameEmail Address is : "+dto.getConformEmail());
        System.out.println("password is : "+dto.getPassword());
        System.out.println("SamePassword is : "+dto.getConformPassword());
        System.out.println("user is registeration is successful");
    }

}
