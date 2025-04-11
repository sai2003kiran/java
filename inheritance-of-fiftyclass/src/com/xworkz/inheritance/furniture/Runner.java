package com.xworkz.inheritance.furniture;

import com.xworkz.inheritance.furniture.cot.Cot;

public class Runner {
    public static void main(String[] args) {
        Furinture parent = new Furinture();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Cot child = new Cot();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
