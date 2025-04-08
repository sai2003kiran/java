package com.xworkz.bbcApp.bbc;

import com.xworkz.bbcApp.bbcdto.BCCDto;

public class BBC {
    public  boolean User(BCCDto bbcDto){
        boolean isUserRegisterd = false;
        boolean uservalid = validateUser(bbcDto);
        if(uservalid == true )
            isUserRegisterd = true;
        else{
            System.out.println("not register");
        }
        return  isUserRegisterd;
    }

    public boolean validateUser(BCCDto bbcDto){
        boolean isUserValidated = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;
        boolean ispreversence = false;

        if(bbcDto.getEmail()!=null){
            isEmail = true;
        }
        if(bbcDto.getName()!=null){
            isName = true;
        }
        if(bbcDto.getPhnNo()!=0){
            isPhnNo = true;
        }
        if(bbcDto.getPreferences()!=null){
            ispreversence = true;
        }
        if(isEmail == true && isName == true && isPhnNo == true && ispreversence == true)
            isUserValidated = true;
        else
            System.out.println("try again");
        return isUserValidated;
    }
}
