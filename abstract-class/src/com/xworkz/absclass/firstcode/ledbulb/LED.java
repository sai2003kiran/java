package com.xworkz.absclass.firstcode.ledbulb;

import com.xworkz.absclass.firstcode.functionality.Switch;

public class LED implements Switch {

    @Override
    public void on() {
        System.out.println("led is power on ");
    }

    @Override
    public void off() {
        System.out.println("led is power off");
    }
}
