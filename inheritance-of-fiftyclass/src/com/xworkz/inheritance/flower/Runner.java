package com.xworkz.inheritance.flower;
import com.xworkz.inheritance.flower.rose.Rose;

public class Runner {
    public static void main(String[] args) {
        Flower parent = new Flower();
        System.out.println("the parent (superClass) started");
        parent.fetchFlower();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Rose child = new Rose();
        System.out.println("the child (subClass) started");
        child.fetchFlower();
        System.out.println("the child (subClass) ended");
    }
}
