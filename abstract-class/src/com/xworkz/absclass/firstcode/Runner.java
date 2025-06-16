package com.xworkz.absclass.firstcode;

import com.xworkz.absclass.firstcode.functionality.Switch;
import com.xworkz.absclass.firstcode.ledbulb.LED;
import com.xworkz.absclass.firstcode.tubelightimp.Tubelight;

public class Runner {
    public static void main(String[] args) {
        Switch access = new Tubelight();
        access.on();
        access.off();
        Switch control = new LED();
        control.on();
        control.off();
    }
}
