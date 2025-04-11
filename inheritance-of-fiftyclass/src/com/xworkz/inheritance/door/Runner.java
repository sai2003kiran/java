package com.xworkz.inheritance.door;


import com.xworkz.inheritance.door.fabric.FabricGlass;

public class Runner {
    public static void main(String[] args) {
        Door parent = new Door();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        FabricGlass child = new FabricGlass();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
