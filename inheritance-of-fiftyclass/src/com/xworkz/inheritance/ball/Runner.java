package com.xworkz.inheritance.ball;

import com.xworkz.inheritance.ball.football.Football;

public class Runner {
    public static void main(String[] args) {
        Ball parent = new Ball();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Football child = new Football();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
