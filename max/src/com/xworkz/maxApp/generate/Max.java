package com.xworkz.maxApp.generate;

import com.xworkz.maxApp.max.MaxDto;

public class Max {
    public boolean User(MaxDto maxDto) {
        boolean isUser = false;
        boolean validUser = validatedUser(maxDto);
        if (validUser == true)
            isUser = true;
        else {
            System.out.println("user is not registered");
        }
        return isUser;
    }

    public boolean validatedUser(MaxDto maxDto) {
        boolean isUserValidate = false;
        boolean isFullName = false;
        boolean isEmailAddress = false;
        boolean isPassword = false;
        boolean isConfirmPassword = false;

        if (maxDto.getFullName() != null) {
            isFullName = true;
        }
        if (maxDto.getEmailAddress() != null) {
            isEmailAddress = true;
        }
        if (maxDto.getPassword() != null) {
            isPassword = true;
        }
        if (maxDto.getConfirmPassword() != null) {
            isConfirmPassword = true;
        }
        if (isFullName == true && isEmailAddress == true && isPassword == true && isConfirmPassword == true)
            isUserValidate = true;
        else
            System.out.println("try again ");
        return isUserValidate;
    }
}


