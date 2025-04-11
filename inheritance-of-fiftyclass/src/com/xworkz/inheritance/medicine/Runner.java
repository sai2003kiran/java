package com.xworkz.inheritance.medicine;

import com.xworkz.inheritance.medicine.doolo.Doolo;

public class Runner {
    public static void main(String[] args) {
        Medicine parent = new Medicine();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Doolo child = new Doolo();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
