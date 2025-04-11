package com.xworkz.inheritance.cryptocurrency;

import com.xworkz.inheritance.cryptocurrency.bitcoin.Bitcion;

public class Runner {
    public static void main(String[] args) {
        Crytocurrency parent = new Crytocurrency();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Bitcion child = new Bitcion();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
