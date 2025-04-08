package com.xworkz.stravaApp;

import com.xworkz.stravaApp.Constants.Gender;
import com.xworkz.stravaApp.strava.Strava;
import com.xworkz.stravaApp.stravadto.StravaDto;

public class StravaRunner {
    public static void main(String arg[]){

        StravaDto stravaDto = new StravaDto();
        stravaDto.setEmail("bgsu335");
        stravaDto.setName("mjutes");
        stravaDto.setPhnNo(5638298643l);
        stravaDto.setGender(Gender.female);
        stravaDto.setAge(21);

        Strava strava = new Strava();
        if(strava.User(stravaDto)){
            System.out.println("successfull");
        }
        else
            System.out.println("unsuccesfull");
    }
}
