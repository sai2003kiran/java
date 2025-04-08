package com.xworkz.learningApp.learning;

import com.xworkz.learningApp.learningdto.LearningDto;

public class Learning {
    public  boolean User(LearningDto learningDto){
        boolean isUserRegisterd = false;
        boolean uservalid = validateUser(learningDto);
        if(uservalid == true )
            isUserRegisterd = true;
        else{
            System.out.println("not register");
        }
        return  isUserRegisterd;
    }

    public boolean validateUser(LearningDto learningDto){
        boolean isUserValidated = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;
        boolean isCourseType = false;
        boolean isPaymentType = false;

        if(learningDto.getEmail()!=null){
            isEmail = true;
        }
        if(learningDto.getName()!=null){
            isName = true;
        }
        if(learningDto.getPhnNo()!=0){
            isPhnNo = true;
        }
        if(learningDto.getCourseType()!=null){
            isCourseType = true;
        }
        if(learningDto.getPaymentType()!=null){
            isPaymentType = true;
        }
        if(isEmail == true && isName == true && isPhnNo == true && isCourseType == true && isPaymentType == true)
            isUserValidated = true;
        else
            System.out.println("try again");
        return isUserValidated;
    }

}
