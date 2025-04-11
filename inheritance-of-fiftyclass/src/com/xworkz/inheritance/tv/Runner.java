package com.xworkz.inheritance.tv;

import com.xworkz.inheritance.tv.sumsung.SumsungTelevision;

public class Runner {
    public static void main(String[] args) {
        TV parent = new TV();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        SumsungTelevision child = new SumsungTelevision();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
