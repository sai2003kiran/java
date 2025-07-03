package com.xworkz.exphdg.expection;

public class CustomerNameNotFound extends RuntimeException{
    public CustomerNameNotFound(String message){
        super(message);
    }
}
