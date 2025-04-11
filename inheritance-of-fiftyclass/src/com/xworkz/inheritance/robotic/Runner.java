package com.xworkz.inheritance.robotic;

import com.xworkz.inheritance.robotic.Robotice;
import com.xworkz.inheritance.robotic.drone.Drone;

public class Runner {
    public static void main(String[] args) {
        Robotice parent = new Robotice();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Drone child = new Drone();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
