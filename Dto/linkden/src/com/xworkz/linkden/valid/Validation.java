package com.xworkz.linkden.valid;

import com.xworkz.linkden.Dto.DataDto;

public class Validation {
    DataDto dto;
    public static boolean verification(DataDto dataDto){
        boolean isFristName = false;
        boolean isLastName = false;
        boolean isMiddleName = false;
        boolean isDob = false;
        boolean isEmail = false;
        boolean isPassword = false;
        boolean isCrossCheck = false;
        if (dataDto.getFristName()!=null && dataDto.getFristName().length()>=3){
            isFristName=true;
        }else{
            isFristName=false;
            System.out.println("Incorrect fristName");
        }

        if (dataDto.getMiddleName()!=null && dataDto.getMiddleName().length()>=3){
            isMiddleName=true;
        }else{
            isMiddleName=false;
            System.out.println("Incorrect middleName");
        }

        if (dataDto.getLastName()!=null && dataDto.getLastName().length()>=1){
            isLastName=true;
        }else{
            isLastName=false;
            System.out.println("Incorrect lastName");
        }

        if(dataDto.getDob()!=null && dataDto.getDob().length()>=8 && dataDto.getDob().length()<=10){
            isDob=true;
        }else{
            isDob=false;
            System.out.println("Incorrect Dob");
        }


        if(dataDto.getEmail()!=null && dataDto.getEmail().length()>=13){
            isEmail=true;
        }else{
            isEmail=false;
            System.out.println("Incorrect email");
        }

        if(dataDto.getPassword()!=null &&dataDto.getPassword().length()>=8 && dataDto.getPassword().length()<=10){
            isPassword=true;
        }else{
            isPassword=false;
            System.out.println("Incorrect password");
        }

        if(isFristName==true && isMiddleName==true && isLastName==true && isDob==true && isEmail==true && isPassword==true){
            isCrossCheck=true;
        }else{
            isCrossCheck=false;
            System.out.println("verification failed");
        }

        return isCrossCheck;
    }


    public void UserProfile(DataDto dataDto){
        boolean validation = verification(dataDto);
        boolean isCrossCheck=false;
        if(validation){
            isCrossCheck=true;
            dto = dataDto;
        }else{
            System.out.println("UserProfile is UnSuccessful");
        }
    }

    public void fetchDetails(){
        System.out.println("firstName :"+dto.getFristName());
        System.out.println("DoB :"+dto.getDob());
        System.out.println("Password :"+dto.getPassword());
        System.out.println("Gender :"+dto.getLastName());
        System.out.println("City :"+dto.getMiddleName());
        System.out.println("user registration is successful");
    }


}
