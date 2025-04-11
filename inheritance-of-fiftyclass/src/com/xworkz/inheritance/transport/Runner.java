package com.xworkz.inheritance.transport;

import com.xworkz.inheritance.transport.ship.Ship;

public class Runner {
    public static void main(String[] args) {
        Transport parent = new Transport();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Ship child = new Ship();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
