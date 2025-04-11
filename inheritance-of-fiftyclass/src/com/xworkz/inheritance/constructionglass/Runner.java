package com.xworkz.inheritance.constructionglass;

import com.xworkz.inheritance.constructionglass.window.Window;

public class Runner {
    public static void main(String[] args) {
        ConstructionGlass parent = new ConstructionGlass();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Window child = new Window();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
