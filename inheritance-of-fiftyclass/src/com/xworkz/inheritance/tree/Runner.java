package com.xworkz.inheritance.tree;

import com.xworkz.inheritance.tree.coconut.Coconut;

public class Runner {
    public static void main(String[] args) {
        Tree parent = new Tree();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Coconut child = new Coconut();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");

    }

}
