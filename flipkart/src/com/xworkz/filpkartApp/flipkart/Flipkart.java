package com.xworkz.filpkartApp.flipkart;

import com.xworkz.filpkartApp.flipkartdto.FlipkartDto;

public class Flipkart {
    public  boolean User(FlipkartDto flipkartDto){
        boolean isUserRegisterd = false;
        boolean uservalid = validateUser(flipkartDto);
        if(uservalid == true )
            isUserRegisterd = true;
        else{
            System.out.println("not register");
        }
          return  isUserRegisterd;
    }

    public boolean validateUser(FlipkartDto flipkartDto){
        boolean isUserValidated = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;
        boolean isPaymentInformation = false;

        if(flipkartDto.getEmail()!=null){
            isEmail = true;
        }
        if(flipkartDto.getName()!=null){
            isName = true;
        }
        if(flipkartDto.getPhnNo()!=0){
            isPhnNo = true;
        }
        if(flipkartDto.getPaymentInformation()!=null){
            isPaymentInformation = true;
        }
        if(isEmail == true && isName == true && isPhnNo == true && isPaymentInformation == true)
            isUserValidated = true;
        else
            System.out.println("try again");
        return isUserValidated;
    }
}
