package com.xworkz.inheritance.sportswear;

import com.xworkz.inheritance.sportswear.swimsuit.Swimsuit;

public class Runner {
    public static void main(String[] args) {
        Sportswear parent = new Sportswear();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Swimsuit child = new Swimsuit();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
