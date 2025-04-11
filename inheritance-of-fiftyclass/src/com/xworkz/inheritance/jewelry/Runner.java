package com.xworkz.inheritance.jewelry;

import com.xworkz.inheritance.jewelry.necklace.Necklace;

public class Runner {
    public static void main(String[] args) {
        Jewelry parent = new Jewelry();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Necklace child = new Necklace();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
