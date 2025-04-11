package com.xworkz.inheritance.glass;

import com.xworkz.inheritance.food.Food;
import com.xworkz.inheritance.food.dosa.MasalaDose;
import com.xworkz.inheritance.glass.mirror.Mirror;

public class Runner {
    public static void main(String[] args) {
        Glass parent = new Glass();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Mirror child = new Mirror();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
