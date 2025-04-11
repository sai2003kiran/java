package com.xworkz.inheritance.wood;

import com.xworkz.inheritance.wood.table.Table;

public class Runner {
    public static void main(String[] args) {
        Wood parent = new Wood();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Table child = new Table();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
