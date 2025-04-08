package com.xworkz.linkedinApp.linkdin;

import com.xworkz.linkedinApp.linkdindto.LinkdinDto;

public class LinkedIn {
    public  boolean User(LinkdinDto linkdinDto){
        boolean isUserRegisterd = false;
        boolean uservalid = validateUser(linkdinDto);
        if(uservalid == true )
            isUserRegisterd = true;
        else{
            System.out.println("not register");
        }
        return  isUserRegisterd;
    }

    public boolean validateUser(LinkdinDto linkdinDto){
        boolean isUserValidated = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;
        boolean isSoftware = false;
        boolean isEducation = false;

        if(linkdinDto.getEmail()!=null){
            isEmail = true;
        }
        if(linkdinDto.getName()!=null){
            isName = true;
        }
        if(linkdinDto.getPhnNo()!=0){
            isPhnNo = true;
        }
        if(linkdinDto.getSoftwareskills()!=null){
            isSoftware = true;
        }
        if(linkdinDto.getEduaction()!=null){
            isEducation = true;
        }
        if(isEmail == true && isName == true && isPhnNo == true && isSoftware == true && isEducation == true)
            isUserValidated = true;
        else
            System.out.println("try again");
        return isUserValidated;
    }

}
