package com.xworkz.inheritance.cosmicproduct;

import com.xworkz.inheritance.cosmicproduct.facecream.FaceCream;

public class Runner {
    public static void main(String[] args) {
    CosmicProduct parent = new CosmicProduct();
    System.out.println("the parent (superClass) started");
    parent.fetch();
    System.out.println("the parent (superClass) ended");
    System.out.println(">>>>>Completed<<<<<");
    FaceCream child = new FaceCream();
    System.out.println("the child (subClass) started");
    child.fetch();
    System.out.println("the child (subClass) ended");
}

}
