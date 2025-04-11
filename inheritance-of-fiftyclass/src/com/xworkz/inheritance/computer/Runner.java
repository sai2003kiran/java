package com.xworkz.inheritance.computer;

import com.xworkz.inheritance.computer.Computer;
import com.xworkz.inheritance.computer.laptop.Laptop;

public class Runner {
    public static void main(String[] args) {
        Computer parent = new Computer();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Laptop child = new Laptop();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
