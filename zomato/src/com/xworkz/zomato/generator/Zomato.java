package com.xworkz.zomato.generator;

import com.xworkz.zomato.encaplatedDto.ZomatoDto;

public class Zomato {
    public boolean userValidate(ZomatoDto zomatoDto) {
        boolean isValid = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;

        if (zomatoDto.getUserName() != null && !zomatoDto.getUserName().isEmpty() && zomatoDto.getUserName().length() > 3) {
            isNameValid = true;
        } else {
            System.out.println("Invalid username. Please try again.");
        }

        if (zomatoDto.getEmail() != null && !zomatoDto.getEmail().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Invalid email address. Please try again.");
        }

        if (zomatoDto.getPassword() != null && zomatoDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }

        if (zomatoDto.getPhoneNumber() != null && zomatoDto.getPhoneNumber().length() == 10) {
            isPhoneValid = true;
        } else {
            System.out.println("Invalid phone number. Please enter 10 digits.");
        }

        if (zomatoDto.getGender() != null) {
            isGenderValid = true;
        } else {
            System.out.println("Please select your gender.");
        }

        if (isNameValid && isEmailValid && isPasswordValid && isPhoneValid && isGenderValid) {
            isValid = true;
        } else {
            System.out.println("Registration failed due to invalid data.");
        }

        return isValid;
    }

    public void registerUser(ZomatoDto zomatoDto) {
        boolean isValid = userValidate(zomatoDto);
        if (isValid) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed. Please check your details.");
        }
    }
}
