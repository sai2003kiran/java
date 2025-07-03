package com.xworkz.exp.expection;

public class StudentNameNotFound extends RuntimeException {
    public StudentNameNotFound(String em)
    {
        super(em);
    }
}
