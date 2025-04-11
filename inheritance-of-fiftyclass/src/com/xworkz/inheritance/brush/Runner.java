package com.xworkz.inheritance.brush;


import com.xworkz.inheritance.brush.toothbrush.ToothBrush;

public class Runner {
    public static void main(String[] args) {
        ToothBrush parent = new ToothBrush();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Brush child = new Brush();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
