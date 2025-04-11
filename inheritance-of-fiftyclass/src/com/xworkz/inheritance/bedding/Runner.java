package com.xworkz.inheritance.bedding;
import com.xworkz.inheritance.bedding.mattress.Mattress;
public class Runner {
    public static void main(String[] args) {
        Bedding parent = new Bedding();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Mattress child = new Mattress();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
