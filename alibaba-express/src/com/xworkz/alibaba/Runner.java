package com.xworkz.alibaba;

import com.xworkz.alibaba.data.Data;

public class Runner {
    public static void main(String[] args) {
        Data setting = new Data();
        setting.setFullName("babaram");
        setting.setDob("11-11-2003");
        setting.setEmail("ddhuieh@hdgdghd.com");
        setting.setConformEmail("ddhuieh@hdgdghd.com");
        setting.setPassword("1234567890");
        setting.setConformPassword("1234567890");

        ValidationDto getting = new ValidationDto();
        getting.userprofile(setting);
        getting.fetchDetails();
    }
}
