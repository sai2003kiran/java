package com.xworkz.snapchatapp.generatesnapchat;

import com.xworkz.snapchatapp.snapchatdto.SnapchatDto;

public class Snapchat {

    public boolean newAccount(SnapchatDto snapchatDto) {
        boolean isUserRegistered = false;
        boolean userValidated = validateAccount(snapchatDto);
        if (userValidated) {
            isUserRegistered = true;
        } else {
            System.out.println("User details invalid....");
        }
        return isUserRegistered;
    }

    public boolean validateAccount(SnapchatDto snapchatDto) {
        boolean userValidated = false;
        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean dobValid = false;
        boolean genderValid = false;
        boolean emailValid = false;
        boolean mobileValid = false;
        boolean passwordValid = false;
        boolean userNameValid = false;

        if (snapchatDto.getFirstName() != null && !snapchatDto.getFirstName().isEmpty()) {
            firstNameValid = true;
        } else {
            System.out.println("Invalid First Name!!!!");
        }

        if (snapchatDto.getLastName() != null && !snapchatDto.getLastName().isEmpty()) {
            lastNameValid = true;
        } else {
            System.out.println("Invalid Last Name!!!!");
        }

        if (snapchatDto.getDob() != null && !snapchatDto.getDob().isEmpty()) {
            dobValid = true;
        } else {
            System.out.println("Invalid Date of Birth!!!!");
        }

        if (snapchatDto.getGender() != null) {
            genderValid = true;
        } else {
            System.out.println("Invalid Gender!!!!");
        }

        if (snapchatDto.getEmail() != null && !snapchatDto.getEmail().isEmpty()) {
            emailValid = true;
        } else {
            System.out.println("Invalid Email!!!!");
        }

        if (snapchatDto.getMobile() != null && !snapchatDto.getMobile().isEmpty()) {
            mobileValid = true;
        } else {
            System.out.println("Invalid Mobile Number!!!!");
        }

        if (snapchatDto.getPassword() != null && !snapchatDto.getPassword().isEmpty()) {
            passwordValid = true;
        } else {
            System.out.println("Invalid Password!!!!");
        }

        if (snapchatDto.getUserName() != null && !snapchatDto.getUserName().isEmpty()) {
            userNameValid = true;
        } else {
            System.out.println("Invalid Username!!!!");
        }

        if (firstNameValid && lastNameValid && dobValid && genderValid && emailValid &&
                mobileValid && passwordValid && userNameValid) {
            userValidated = true;
        }

        return userValidated;
    }
}
