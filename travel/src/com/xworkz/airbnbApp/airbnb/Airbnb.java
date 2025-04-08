package com.xworkz.airbnbApp.airbnb;

import com.xworkz.airbnbApp.airbnbdto.AirbnbDto;

public class Airbnb {
    public boolean User(AirbnbDto airbnbDto) {
        boolean isUserRegisterd = false;
        boolean uservalid = validateUser(airbnbDto);
        if (uservalid == true)
            isUserRegisterd = true;
        else {
            System.out.println("not register");
        }
        return isUserRegisterd;
    }

    public boolean validateUser(AirbnbDto airbnbDto) {
        boolean isUserValidated = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;
        boolean isTravelType = false;
        boolean isPaymentType = false;

        if (airbnbDto.getEmail() != null) {
            isEmail = true;
        }
        if (airbnbDto.getName() != null) {
            isName = true;
        }
        if (airbnbDto.getPhnNo() != 0) {
            isPhnNo = true;
        }
        if (airbnbDto.getTravelType() != null) {
            isTravelType = true;
        }
        if (airbnbDto.getPaymentType() != null) {
            isPaymentType = true;
        }
        if (isEmail == true && isName == true && isPhnNo == true && isTravelType == true && isPaymentType == true)
            isUserValidated = true;
        else
            System.out.println("try again");
        return isUserValidated;
    }
}
