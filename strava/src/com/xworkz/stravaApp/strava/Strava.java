package com.xworkz.stravaApp.strava;

import com.xworkz.stravaApp.stravadto.StravaDto;

public class Strava {
    public  boolean User(StravaDto stravaDto){
        boolean isUserRegisterd = false;
        boolean uservalid = validateUser(stravaDto);
        if(uservalid == true )
            isUserRegisterd = true;
        else{
            System.out.println("not register");
        }
        return  isUserRegisterd;
    }

    public boolean validateUser(StravaDto stravaDto){
        boolean isUserValidated = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;
        boolean isGender = false;
        boolean isAge = false;

        if(stravaDto.getEmail()!=null){
            isEmail = true;
        }
        if(stravaDto.getName()!=null){
            isName = true;
        }
        if(stravaDto.getPhnNo()!=0){
            isPhnNo = true;
        }
        if(stravaDto.getGender()!=null){
            isGender = true;
        }
        if(stravaDto.getAge()!=0){
            isAge = true;
        }
        if(isEmail == true && isName == true && isPhnNo == true && isGender == true && isAge == true)
            isUserValidated = true;
        else
            System.out.println("try again");
        return isUserValidated;
    }
}
