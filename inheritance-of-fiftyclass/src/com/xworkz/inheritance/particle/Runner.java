package com.xworkz.inheritance.particle;

import com.xworkz.inheritance.particle.atom.Atom;

public class Runner {
    public static void main(String[] args) {
        Particle parent = new Particle();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Atom child = new Atom();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
