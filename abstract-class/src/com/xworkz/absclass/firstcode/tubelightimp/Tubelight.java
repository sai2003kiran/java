package com.xworkz.absclass.firstcode.tubelightimp;

import com.xworkz.absclass.firstcode.functionality.Switch;

public class Tubelight implements Switch {
    @Override
    public void on() {
        System.out.println("tube light power on");
    }
    @Override
    public void off() {
        System.out.println("tube light power off");
    }
}
