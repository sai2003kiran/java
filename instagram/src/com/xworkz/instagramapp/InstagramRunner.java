package com.xworkz.instagramapp;

import com.xworkz.instagramapp.constants.Gender;
import com.xworkz.instagramapp.instagramdto.InstagramDto;
import com.xworkz.instagramapp.generateinstagram.Instagram;

public class InstagramRunner {

    public static void main(String[] args) {

        System.out.println("----------------------------------");

        InstagramDto instagramDto = new InstagramDto();
        instagramDto.setFirstName("Akhil");
        instagramDto.setLastName("Raj");
        instagramDto.setDob("01/01/2000");
        instagramDto.setGender(Gender.Male);
        instagramDto.setEmail("akhilraj@gmail.com");
        instagramDto.setMobile("9876543210");
        instagramDto.setUserName("akhil_raj");
        instagramDto.setPassword("akhil@insta");

        System.out.println("The First Name: " + instagramDto.getFirstName());
        System.out.println("The Last Name: " + instagramDto.getLastName());
        System.out.println("The DOB: " + instagramDto.getDob());
        System.out.println("The Gender: " + instagramDto.getGender());
        System.out.println("The Email: " + instagramDto.getEmail());
        System.out.println("The Mobile: " + instagramDto.getMobile());
        System.out.println("The Username: " + instagramDto.getUserName());
        System.out.println("The Password: " + instagramDto.getPassword());

        System.out.println("----------------------------------");

        Instagram instagram = new Instagram();
        instagram.newAccount(instagramDto);
    }
}
