package com.xworkz.inheritance.food;

import com.xworkz.inheritance.food.dosa.MasalaDose;
import com.xworkz.inheritance.tree.Tree;
import com.xworkz.inheritance.tree.coconut.Coconut;

public class Runner {
    public static void main(String[] args) {
        Food parent = new Food();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        MasalaDose child = new MasalaDose();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");

    }
}
