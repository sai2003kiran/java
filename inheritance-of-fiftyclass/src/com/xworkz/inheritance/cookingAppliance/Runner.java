package com.xworkz.inheritance.cookingAppliance;

import com.xworkz.inheritance.cookingAppliance.pressureCooker.PressureCooker;

public class Runner {
    public static void main(String[] args) {
        CookingAppliance parent = new CookingAppliance();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        PressureCooker child = new PressureCooker();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
