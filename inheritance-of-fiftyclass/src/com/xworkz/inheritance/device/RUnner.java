package com.xworkz.inheritance.device;

import com.xworkz.inheritance.device.Device;
import com.xworkz.inheritance.device.speaker.Speaker;

public class RUnner {
    public static void main(String[] args) {
        Device parent = new Device();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Device child = new Device();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
