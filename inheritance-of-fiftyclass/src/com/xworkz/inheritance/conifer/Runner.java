package com.xworkz.inheritance.conifer;

import com.xworkz.inheritance.conifer.pine.Pine;

public class Runner {
        public static void main(String[] args) {
            Conifer parent = new Conifer();
            System.out.println("the parent (superClass) started");
            parent.fetch();
            System.out.println("the parent (superClass) ended");
            System.out.println(">>>>>Completed<<<<<");
            Pine child = new Pine();
            System.out.println("the child (subClass) started");
            child.fetch();
            System.out.println("the child (subClass) ended");
        }
}
