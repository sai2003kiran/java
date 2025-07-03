package com.xworkz.exphdg.expection;

public class CustomerItemNotFound extends RuntimeException {
    public CustomerItemNotFound(String errorMessage){
        super(errorMessage);
    }
}
