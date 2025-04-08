package com.xworkz.bankApp.bank;

import com.xworkz.bankApp.bankdto.BankDto;

public class Bank {
    public  boolean User(BankDto bankDto){
        boolean isUserRegisterd = false;
        boolean uservalid = validateUser(bankDto);
        if(uservalid == true )
            isUserRegisterd = true;
        else{
            System.out.println("not register");
        }
        return  isUserRegisterd;
    }

    public boolean validateUser(BankDto bankDto){
        boolean isUserValidated = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;
        boolean isAccountType = false;

        if(bankDto.getEmail()!=null){
            isEmail = true;
        }
        if(bankDto.getName()!=null){
            isName = true;
        }
        if(bankDto.getPhnNo()!=0){
            isPhnNo = true;
        }
        if(bankDto.getAccountType()!=null){
            isAccountType = true;
        }
        if(isEmail == true && isName == true && isPhnNo == true && isAccountType == true)
            isUserValidated = true;
        else
            System.out.println("try again");
        return isUserValidated;
    }
}
