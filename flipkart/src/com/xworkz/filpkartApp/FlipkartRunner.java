package com.xworkz.filpkartApp;

import com.xworkz.filpkartApp.Constants.Payment;
import com.xworkz.filpkartApp.flipkart.Flipkart;
import com.xworkz.filpkartApp.flipkartdto.FlipkartDto;

public class FlipkartRunner {
    public static void main(String arg[]){

        FlipkartDto flipkartDto = new FlipkartDto();
        flipkartDto.setEmail("bgsu335");
        flipkartDto.setName("mjutes");
        flipkartDto.setPhnNo(5638298643l);
        flipkartDto.setPaymentInformation(Payment.cashondelivery);

        Flipkart flipkart = new Flipkart();
        if(flipkart.User(flipkartDto)){
            System.out.println("successfull");
        }
        else
            System.out.println("unsuccesfull");
    }
}
