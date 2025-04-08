package com.xworkz.bigbasketApp;

import com.xworkz.bigbasketApp.Constants.Payment;
import com.xworkz.bigbasketApp.bigbasket.BigBasket;
import com.xworkz.bigbasketApp.bigbasketdto.BigbasketDto;

public class BigBasketRunner {
    public static void main(String arg[]){

        BigbasketDto bigbasketDto = new BigbasketDto();
        bigbasketDto.setEmail("bgsu335");
        bigbasketDto.setName("mjutes");
        bigbasketDto.setPhnNo(5638298643l);
        bigbasketDto.setPaymentInformation(Payment.card);

        BigBasket bigBasket = new BigBasket();
        if(bigBasket.User(bigbasketDto)){
            System.out.println("successfull");
        }
        else
            System.out.println("unsuccesfull");
    }
}
