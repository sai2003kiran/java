package com.xworkz.facebookApp.facebook;

import com.xworkz.facebookApp.facebookdto.FaceBookDto;

public class FaceBook {
    public boolean registerUser(FaceBookDto faceBook) {
        boolean isUserRegistered = false;
        boolean userValid = validateUser();
        if (userValid == true)
            isUserRegistered = true;
        else {
            System.out.println("not registered");
        }
        return isUserRegistered;
    }

    public boolean validateUser() {
        boolean isUserValidate = false;
        boolean isFullName = false;
        boolean isEmail = false;
        boolean isPassword = false;
        boolean isDob = false;
        boolean isGender = false;

        FaceBookDto faceBookDto = null;
        if (faceBookDto.getFullName() != null) {
            isFullName = true;
        }
        if (faceBookDto.getEmail() != null) {
            isEmail = true;
        }
        if (faceBookDto.getPassword() != null) {
            isPassword = true;
        }
        if (faceBookDto.getDob() != null) {
            isDob = true;
        }
        if (faceBookDto.getGender() != null) {
            isGender = true;
        }
        if (isFullName == true && isDob == true && isEmail == true && isGender == true && isPassword == true)
            isUserValidate = true;
        else
            System.out.println("try again");
        return isUserValidate;

    }
}
