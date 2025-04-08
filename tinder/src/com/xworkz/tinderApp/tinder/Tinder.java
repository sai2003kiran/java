package com.xworkz.tinderApp.tinder;

import com.xworkz.tinderApp.tinderdto.TinderDto;

public class Tinder {
    public  boolean User(TinderDto tinderDto){
        boolean isUserRegisterd = false;
        boolean uservalid = validateUser(tinderDto);
        if(uservalid == true )
            isUserRegisterd = true;
        else{
            System.out.println("not register");
        }
        return  isUserRegisterd;
    }

    public boolean validateUser(TinderDto tinderDto){
        boolean isUserValidated = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;
        boolean isGender = false;

        if(tinderDto.getEmail()!=null){
            isEmail = true;
        }
        if(tinderDto.getName()!=null){
            isName = true;
        }
        if(tinderDto.getPhnNo()!=0){
            isPhnNo = true;
        }
        if(tinderDto.getGender()!=null){
            isGender = true;
        }
        if(isEmail == true && isName == true && isPhnNo == true && isGender == true)
            isUserValidated = true;
        else
            System.out.println("try again");
        return isUserValidated;
    }
}
