package com.xworkz.maxApp;

import com.xworkz.maxApp.max.MaxDto;

public class MaxRunner {
    public static void main(String arg[]){

        MaxDto maxDto = new MaxDto();
        maxDto.setFullName("Shalini");
        maxDto.setEmailAddress("cshali@345");
        maxDto.setPassword("Shali4553");
        maxDto.setConfirmPassword("Shali4553");

        MaxDto maxDto1 = new MaxDto();
        if(maxDto1.isUser(maxDto)){
            System.out.println("successful");
        }
        else
            System.out.println("unsuccessful");
    }
}
