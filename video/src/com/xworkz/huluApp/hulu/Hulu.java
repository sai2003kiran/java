package com.xworkz.huluApp.hulu;

import com.xworkz.huluApp.huludto.HuluDto;

public class Hulu {
    public  boolean User(HuluDto huluDto){
        boolean isUserRegisterd = false;
        boolean uservalid = validateUser(huluDto);
        if(uservalid == true )
            isUserRegisterd = true;
        else{
            System.out.println("not register");
        }
        return  isUserRegisterd;
    }

    public boolean validateUser(HuluDto huluDto){
        boolean isUserValidated = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;
        boolean isSubcribtion = false;
        boolean isPassword = false;

        if(huluDto.getEmail()!=null){
            isEmail = true;
        }
        if(huluDto.getName()!=null){
            isName = true;
        }
        if(huluDto.getPhnNo()!=0){
            isPhnNo = true;
        }
        if(huluDto.getSubcribtion()!=null){
            isSubcribtion = true;
        }
        if(huluDto.getPassword()!=null){
            isPassword = true;
        }
        if(isEmail == true && isName == true && isPhnNo == true && isSubcribtion == true && isPassword == true)
            isUserValidated = true;
        else
            System.out.println("try again");
        return isUserValidated;
    }
}
