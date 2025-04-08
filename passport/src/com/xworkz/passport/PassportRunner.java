package com.xworkz.passport;

import com.xworkz.passport.Constants.CpvLocation;
import com.xworkz.passport.Constants.DcdrLocation;
import com.xworkz.passport.generatepassport.PassportSeva;
import com.xworkz.passport.passportDto.PassportDto;

public class PassportRunner {
    public static void main(String arg []){

        PassportDto passportDto = new PassportDto();
        passportDto.setCpvLocation(CpvLocation.Passportoffice);
        passportDto.setDcdrLocation(DcdrLocation.Mysore);
        passportDto.setGivenName("Shalini");
        passportDto.setSurName("Shetty");
        passportDto.setDob("17/6/2003");
        passportDto.setEmailId("cshalini739@gmail.com");
        passportDto.setEmailIdSameAsLoginId("cshalini739@gmail.com");
        passportDto.setLoginId("Shalini");
        passportDto.setPassword("Shalu");
        passportDto.setConfirmPassword("Shalu");

        PassportSeva passportSeva = new PassportSeva();
       if( passportSeva.registerUser(passportDto)){
           System.out.println("successfull");
       }
       else
           System.out.println("unsuccessfull");



    }
}
