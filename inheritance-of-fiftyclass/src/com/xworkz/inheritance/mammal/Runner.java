package com.xworkz.inheritance.mammal;

import com.xworkz.inheritance.mammal.lion.Lion;


public class Runner {
        public static void main(String[] args) {
            Mammal parent = new Mammal();
            System.out.println("the parent (superClass) started");
            parent.fetch();
            System.out.println("the parent (superClass) ended");
            System.out.println(">>>>>Completed<<<<<");
            Lion child = new Lion();
            System.out.println("the child (subClass) started");
            child.fetch();
            System.out.println("the child (subClass) ended");

        }
    }
