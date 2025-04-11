package com.xworkz.inheritance.aircraft;

import com.xworkz.inheritance.aircraft.helicopter.Helicopter;

public class Runner {
    public static void main(String[] args) {
        Aircraft parent = new Aircraft();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Helicopter child = new Helicopter();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");

    }
}
