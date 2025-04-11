package com.xworkz.inheritance.bird;
import com.xworkz.inheritance.bird.eagle.Eagle;
public class Runner {
    public static void main(String[] args) {
        Bird parent = new Bird();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Eagle child = new Eagle();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
