package com.xworkz.bigbasketApp.bigbasket;

import com.xworkz.bigbasketApp.bigbasketdto.BigbasketDto;

public class BigBasket {
    public  boolean User(BigbasketDto bigbasketDto){
        boolean isUserRegisterd = false;
        boolean uservalid = validateUser(bigbasketDto);
        if(uservalid == true )
            isUserRegisterd = true;
        else{
            System.out.println("not register");
        }
        return  isUserRegisterd;
    }

    public boolean validateUser(BigbasketDto bigbasketDto){
        boolean isUserValidated = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;
        boolean isPaymentInformation = false;

        if(bigbasketDto.getEmail()!=null){
            isEmail = true;
        }
        if(bigbasketDto.getName()!=null){
            isName = true;
        }
        if(bigbasketDto.getPhnNo()!=0){
            isPhnNo = true;
        }
        if(bigbasketDto.getPaymentInformation()!=null){
            isPaymentInformation = true;
        }
        if(isEmail == true && isName == true && isPhnNo == true && isPaymentInformation == true)
            isUserValidated = true;
        else
            System.out.println("try again");
        return isUserValidated;
    }
}
