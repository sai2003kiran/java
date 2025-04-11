package com.xworkz.inheritance.pencil;

import com.xworkz.inheritance.pencil.ballpencil.BallPencil;

public class Runner {
    public static void main(String[] args) {
        Pencil parent = new Pencil();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        BallPencil child = new BallPencil();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
