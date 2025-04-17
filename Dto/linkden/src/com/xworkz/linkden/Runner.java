package com.xworkz.linkden;

import com.xworkz.linkden.Dto.DataDto;
import com.xworkz.linkden.valid.Validation;

public class Runner {
    public static void main(String[] args) {
        DataDto setting = new DataDto();
        setting.setFristName("baba");
        setting.setMiddleName("Singh");
        setting.setLastName("l");
        setting.setDob("12-09-2009");
        setting.setEmail("baba@gmail.com");
        setting.setPassword("123456789");

        Validation getting = new Validation();
        getting.UserProfile(setting);
        getting.fetchDetails();
    }
}
