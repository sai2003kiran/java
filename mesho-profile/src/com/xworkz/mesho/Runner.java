package com.xworkz.mesho;

import com.xworkz.mesho.constants.City;
import com.xworkz.mesho.constants.Gender;
import com.xworkz.mesho.datadto.DataDto;
import com.xworkz.mesho.validation.Verification;

public class Runner {
    public static void main(String[] args) {
        DataDto setting = new DataDto();
        setting.setFullName("baba");
        setting.setDob("12-09-2009");
        setting.setPhno("1234432167");
        setting.setGender(Gender.male);
        setting.setCity(City.Mumbai);

        Verification getting = new Verification();
        getting.profile(setting);
        getting.fetchDetails();
    }
}
