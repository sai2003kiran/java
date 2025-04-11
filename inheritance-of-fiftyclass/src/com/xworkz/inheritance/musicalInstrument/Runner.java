package com.xworkz.inheritance.musicalInstrument;

import com.xworkz.inheritance.musicalInstrument.piyano.Piyano;

public class Runner {
    public static void main(String[] args) {
        MusicalInstrument parent = new MusicalInstrument();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Piyano child = new Piyano();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
