package com.xworkz.inheritance.programminglanguage;

import com.xworkz.inheritance.profession.pilot.Pilot;

public class Runner {
    public static void main(String[] args) {
        ProgrammingLanguage parent = new ProgrammingLanguage();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Pilot child = new Pilot();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
