package com.xworkz.inheritance.paper;

import com.xworkz.inheritance.paper.questionPaper.QuestionPaper;

public class Runner {
    public static void main(String[] args) {
        QuestionPaper parent = new QuestionPaper();
        System.out.println("the parent (superClass) started");
        parent.fetch();
        System.out.println("the parent (superClass) ended");
        System.out.println(">>>>>Completed<<<<<");
        Paper child = new Paper();
        System.out.println("the child (subClass) started");
        child.fetch();
        System.out.println("the child (subClass) ended");
    }
}
