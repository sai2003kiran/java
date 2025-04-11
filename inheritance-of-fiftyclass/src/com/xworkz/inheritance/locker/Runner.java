package com.xworkz.inheritance.locker;

import com.xworkz.inheritance.locker.bankerlocker.BankLocker;

public class Runner {
    public static void main(String[] args) {
        BankLocker parent = new BankLocker();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Locker child = new Locker();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
