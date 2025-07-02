package com.xworkz.expection.expfoider;

public class TrainNameNotFounnd extends RuntimeException{
    public TrainNameNotFounnd(String errorMessage){
        super(errorMessage);
    }
}
