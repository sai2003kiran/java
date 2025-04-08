package com.xworkz.youtubeApp.youtube;

import com.xworkz.youtubeApp.youtubedto.YouTubeDto;

public class YouTube {
    public  boolean User(YouTubeDto youTubeDto){
        boolean isUserRegisterd = false;
        boolean uservalid = validateUser(youTubeDto);
        if(uservalid == true )
            isUserRegisterd = true;
        else{
            System.out.println("not register");
        }
        return  isUserRegisterd;
    }

    public boolean validateUser(YouTubeDto youTubeDto){
        boolean isUserValidated = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;
        boolean isSubcribtion = false;
        boolean isPassword = false;

        if(youTubeDto.getEmail()!=null){
            isEmail = true;
        }
        if(youTubeDto.getName()!=null){
            isName = true;
        }
        if(youTubeDto.getPhnNo()!=0){
            isPhnNo = true;
        }
        if(youTubeDto.getSubcribtion()!=null){
            isSubcribtion = true;
        }
        if(youTubeDto.getPassword()!=null){
            isPassword = true;
        }
        if(isEmail == true && isName == true && isPhnNo == true && isSubcribtion == true && isPassword == true)
            isUserValidated = true;
        else
            System.out.println("try again");
        return isUserValidated;
    }
}
