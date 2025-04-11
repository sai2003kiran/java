package com.xworkz.inheritance.mart;

import com.xworkz.inheritance.mart.dmart.DMart;

public class Runner {
    public static void main(String[] args) {
        Mart parent = new Mart();
        System.out.println("the parent (superClass) started");
        parent.fetchMart();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        DMart child = new DMart();
        System.out.println("the child (subClass) started");
        child.fetchMart();
        System.out.println("the child (subClass) ended");

    }
}
