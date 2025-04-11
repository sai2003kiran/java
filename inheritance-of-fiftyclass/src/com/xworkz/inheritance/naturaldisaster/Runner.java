package com.xworkz.inheritance.naturaldisaster;

import com.xworkz.inheritance.naturaldisaster.volcano.Volcano;

public class Runner {
    public static void main(String[] args) {
        NaturalDisaster parent = new NaturalDisaster();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Volcano child = new Volcano();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
