package com.xworkz.huluApp;

import com.xworkz.huluApp.Constants.Subcribtion;
import com.xworkz.huluApp.hulu.Hulu;
import com.xworkz.huluApp.huludto.HuluDto;

public class HuluRunner {
    public static void main(String arg[]){

        HuluDto huluDto = new HuluDto();
        huluDto.setEmail("bgsu335");
        huluDto.setName("mjutes");
        huluDto.setPhnNo(5638298643l);
        huluDto.setSubcribtion(Subcribtion.free);
        huluDto.setPassword("hufsetyj");

        Hulu hulu = new Hulu();
        if(hulu.User(huluDto)){
            System.out.println("successfull");
        }
        else
            System.out.println("unsuccesfull");
    }
}
