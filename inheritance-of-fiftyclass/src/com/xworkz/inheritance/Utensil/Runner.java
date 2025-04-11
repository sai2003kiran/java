package com.xworkz.inheritance.Utensil;

import com.xworkz.inheritance.Utensil.steelGlass.SteelGlass;

public class Runner {
    public static void main(String[] args) {
        Utensile parent = new Utensile();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        SteelGlass child = new SteelGlass();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
