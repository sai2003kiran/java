package com.xworkz.inheritance.toy;

import com.xworkz.inheritance.toy.ironman.IronMan;

public class Runner {
    public static void main(String[] args) {
        Toy parent = new Toy();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        IronMan child = new IronMan();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
