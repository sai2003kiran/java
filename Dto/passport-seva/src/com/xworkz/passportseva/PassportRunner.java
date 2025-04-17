package com.xworkz.passportseva;

import com.xworkz.passportseva.constants.Area;
import com.xworkz.passportseva.constants.Location;
import com.xworkz.passportseva.generatepassport.PassportGenerate;
import com.xworkz.passportseva.passport.PassportDto;

public class PassportRunner {
    public static void main(String[] args) {
        PassportDto passportdto=new PassportDto();
        passportdto.setLocation(Location.BANGALORE);
        passportdto.setArea(Area.CpvDelhi);
        passportdto.setFirstName("kiran");
        passportdto.setLastName("sai");
        passportdto.setBirthDate("22/7/2003");
        passportdto.setEmail("saikiran2@gmail.com");
        passportdto.setEmailSame(true);
        passportdto.setUserId("saikiran2@gmail.com");
        passportdto.setPassword("suma123");
        passportdto.setConfirmPassword("suma123");
        passportdto.setSecurityQuestion("question");
        passportdto.setSecurityAnswer("answer");
        passportdto.setCaptcha("AB7123");

        PassportGenerate passportseva=new PassportGenerate();
        passportseva.userRegisterd(passportdto);
        passportseva.fetchDetails();

    }
}
