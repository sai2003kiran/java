package com.xworkz.inheritance.heart;

import com.xworkz.inheritance.heart.organ.Organ;

public class Runner {
    public static void main(String[] args) {
        Heart parent = new Heart();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Organ child = new Organ();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
