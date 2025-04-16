package com.xworkz.mesho.validation;

import com.xworkz.mesho.constants.City;
import com.xworkz.mesho.constants.Gender;
import com.xworkz.mesho.datadto.DataDto;

public class Verification {
    DataDto dto;
    public boolean verification(DataDto dataDto){
        boolean verify= false;
        boolean fullName = false;
        boolean dob = false;
        boolean phno = false;
        boolean gender = false;
        boolean city = false;

        if (dataDto.getFullName() != null && !dataDto.getFullName().isEmpty()) {
            fullName=true;
        } else System.out.println("invalid fullName");
        if (dataDto.getDob() != null && !dataDto.getDob().isEmpty()) {
            dob=true;
        } else System.out.println("invalid dob");
        if (dataDto.getPhno() != null && !dataDto.getPhno().isEmpty()) {
            phno=true;
        } else System.out.println("invalid phno");
        if (dataDto.getGender() == Gender.male || dataDto.getGender()== Gender.female) {
            gender=true;
        } else System.out.println("invalid Gender");
        if (dataDto.getCity()== City.Bangalore ||dataDto.getCity()== City.Hydrabad ||dataDto.getCity()== City.Mumbai ||dataDto.getCity()== City.Rajasthan) {
            city=true;
        } else System.out.println("entered city is not service");
        if ((city)&&(gender)&&(fullName)&&(dob)&&(phno)) {
            verify=true;
        }else System.out.println("enter invalid user details");
        return verify;
    }

    public void profile(DataDto dataDto){
        boolean valid =verification(dataDto);
        boolean verify=false;
        if (valid) {
            verify=true;
            dto=dataDto;
        }else System.out.println("User registeration is unsuccessful");
    }

    public void fetchDetails(){
        System.out.println("fullName :"+dto.getFullName());
        System.out.println("DoB :"+dto.getDob());
        System.out.println("phno :"+dto.getPhno());
        System.out.println("Gender :"+dto.getGender());
        System.out.println("City :"+dto.getCity());
        System.out.println("user registration is successful");
    }
}
