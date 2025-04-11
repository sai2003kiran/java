package com.xworkz.inheritance.footwear;

import com.xworkz.inheritance.footwear.shoes.Shoes;

public class Runner {
    public static void main(String[] args) {
        Footwear parent = new Footwear();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Shoes child = new Shoes();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
