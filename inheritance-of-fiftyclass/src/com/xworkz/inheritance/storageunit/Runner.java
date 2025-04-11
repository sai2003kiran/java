package com.xworkz.inheritance.storageunit;

import com.xworkz.inheritance.storageunit.cabinet.Cabinet;

public class Runner {
    public static void main(String[] args) {
        StorageUnit parent = new StorageUnit();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Cabinet child = new Cabinet();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
