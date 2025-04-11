package com.xworkz.inheritance.eyewear;

import com.xworkz.inheritance.eyewear.sunglass.SunGlassess;

public class Runner {
    public static void main(String[] args) {
        Eyewear parent = new Eyewear();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        SunGlassess child = new SunGlassess();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
