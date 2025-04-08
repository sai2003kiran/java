package com.xworkz.passport.generatepassport;

import com.xworkz.passport.passportDto.PassportDto;

public class PassportSeva {
    public boolean registerUser(PassportDto passportDto) {
        boolean isUserRegistered = false;
        boolean userValid = validateUser(passportDto);
        if (userValid == true)
            isUserRegistered = true;
        else {
            System.out.println("not registered");
        }
        return isUserRegistered;
    }

    public boolean validateUser(PassportDto passportDto) {
        boolean isUserValidated = false;
        boolean isSurNameValid = false;
        boolean isCpvLocationValid = false;
        boolean isDcdrLocationValid = false;
        boolean isGivenNameValidated = false;
        boolean isDobValidated = false;
        boolean isEmailIdValidated = false;
        boolean isEmailIdSameAsLoginIdValidated = false;
        boolean isLoginIdValidated = false;
        boolean isPasswordValidated = false;
        boolean isConfirmPasswordValidated = false;
        String surName = passportDto.getSurName();
        if (passportDto.getSurName() != null) {
            isSurNameValid = true;
        }
        if (passportDto.getCpvLocation() != null) {
            isCpvLocationValid = true;
        }
        if (passportDto.getDcdrLocation() != null) {
            isDcdrLocationValid = true;
        }
        if (passportDto.getGivenName() != null) {
            isGivenNameValidated = true;
        }
        if (passportDto.getDcdrLocation() != null) {
            isDobValidated = true;
        }
        if (passportDto.getEmailId() != null) {
            isEmailIdValidated = true;
        }
        if (passportDto.getEmailIdSameAsLoginId() != null) {
            isEmailIdSameAsLoginIdValidated = true;
        }
        if (passportDto.getLoginId() != null) {
            isLoginIdValidated = true;
        }
        if (passportDto.getPassword() != null) {
            isPasswordValidated = true;
        }
        if (passportDto.getConfirmPassword() != null) {
            isConfirmPasswordValidated = true;
        }
        if (isSurNameValid == true && isCpvLocationValid == true && isDcdrLocationValid == true && isGivenNameValidated == true &&
                isDobValidated == true && isEmailIdValidated == true && isEmailIdSameAsLoginIdValidated == true && isLoginIdValidated == true
                && isPasswordValidated == true && isConfirmPasswordValidated == true) {
            isUserValidated = true;
        } else
            System.out.println("please try again");
        return isUserValidated;
    }}










