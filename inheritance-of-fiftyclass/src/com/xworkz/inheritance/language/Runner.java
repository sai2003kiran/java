package com.xworkz.inheritance.language;
import com.xworkz.inheritance.language.english.English;
public class Runner {
    public static void main(String[] args) {
        Langauge parent = new Langauge();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        English child = new English();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
