package com.xworkz.inheritance.city;


import com.xworkz.inheritance.city.goa.Goa;

public class Runner {
    public static void main(String[] args) {
        Goa parent = new Goa();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        City child = new City();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
