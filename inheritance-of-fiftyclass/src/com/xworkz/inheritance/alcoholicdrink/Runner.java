package com.xworkz.inheritance.alcoholicdrink;

import com.xworkz.inheritance.alcoholicdrink.wine.Wine;

public class Runner {
    public static void main(String[] args) {
        AlcoholicDrink parent = new AlcoholicDrink();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Wine child = new Wine();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
