package com.xworkz.inheritance.ifb;
import com.xworkz.inheritance.ifb.washingMachine.WashingMachine;

public class Runner {  
    public static void main(String[] args) {
    WashingMachine parent = new WashingMachine();
    System.out.println("the parent (superClass) started");
    parent.fetch();
    System.out.println("the parent (superClass) ended");
    System.out.println(">>>>>Completed<<<<<");
    IFB child = new IFB();
    System.out.println("the child (subClass) started");
    child.fetch();
    System.out.println("the child (subClass) ended");
}
}
