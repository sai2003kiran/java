package com.xworkz.inheritance.book;

import com.xworkz.inheritance.book.novel.Novel;

public class Runner {
    public static void main(String[] args) {
        Book parent = new Book();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Novel child = new Novel();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
