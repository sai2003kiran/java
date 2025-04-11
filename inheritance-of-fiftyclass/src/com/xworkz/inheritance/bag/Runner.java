package com.xworkz.inheritance.bag;

import com.xworkz.inheritance.bag.carrybag.Carrybag;

public class Runner {
    public static void main(String[] args) {
        Bag parent = new Bag();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Carrybag child = new Carrybag();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
