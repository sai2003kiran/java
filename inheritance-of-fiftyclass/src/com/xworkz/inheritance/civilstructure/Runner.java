package com.xworkz.inheritance.civilstructure;

import com.xworkz.inheritance.civilstructure.brigde.Bridge;

public class Runner {
    public static void main(String[] args) {
        CivilStructure parent = new CivilStructure();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Bridge child = new Bridge();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
