package com.xworkz.inheritance.plastic;

import com.xworkz.inheritance.plastic.bottle.Bottle;

public class Runner {
    public static void main(String[] args) {
        Plastic parent = new Plastic();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Bottle child = new Bottle();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
