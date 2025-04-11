package com.xworkz.inheritance.ecommerce;

public class Runner {
    public static void main(String[] args) {
        ecommerce parent = new ecommerce();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Amazon child = new Amazon();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
