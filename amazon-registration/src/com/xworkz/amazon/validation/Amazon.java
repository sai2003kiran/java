package com.xworkz.amazon.validation;

import com.xworkz.amazon.encaplatedDto.AmazonDto;

public class Amazon {
    public boolean uservalid(AmazonDto amazonDto){
        boolean isvalidation = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhno = false;
        boolean ispassword = false;
        boolean isgender = false;

        if (amazonDto.getUserName() != null && !amazonDto.getUserName().isEmpty() && amazonDto.getUserName().length()>3) {
            isName = true;
        }else System.out.println("invalid user name try again later...");

        if (amazonDto.getEmail() != null&& !amazonDto.getEmail().isEmpty()) {
            isEmail = true;
        }else System.out.println("invalid Email address try again later...");

        if (amazonDto.getPassword() != null && amazonDto.getPassword().length()>8 && amazonDto.getPassword().length()<12  ) {
            ispassword =true;
        }else System.out.println("invalid password try again later...");
        if (amazonDto.getPhoneNumber().length()==10) {
            isPhno=true;
        }else System.out.println("invalid phone number try again later...");
        if (amazonDto.getGender() != null) {
            isgender = true;
        }else System.out.println("invalid gender name try again later...");

        if (isName && isEmail && ispassword && isgender && isPhno) {
            isvalidation=true;
        } else System.out.println("inconsistant data try again later...");
        return isvalidation;
    }

    public void userRegister(AmazonDto amazonDto){
        boolean isvalidation = uservalid(amazonDto);
        if (isvalidation) {
            System.out.println("User registeration Sucessful");
        }else System.out.println("User registeration unSucessful");
        return ;
    }

}
