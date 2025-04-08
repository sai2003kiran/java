package com.xworkz.bankApp;

import com.xworkz.bankApp.Constants.Account;
import com.xworkz.bankApp.bank.Bank;
import com.xworkz.bankApp.bankdto.BankDto;

public class BankRunner {
    public static void main(String arg[]){

        BankDto bankDto = new BankDto();
        bankDto.setEmail("bgsu335");
        bankDto.setName("mjutes");
        bankDto.setPhnNo(5638298643l);
        bankDto.setPaymentInformation(Account.creditaccount);

        Bank bank = new Bank();
        if(bank.User(bankDto)){
            System.out.println("successfull");
        }
        else
            System.out.println("unsuccesfull");
    }
}
