package com.xworkz.exphdg.expection;

public class CustomerPriceNotFound extends RuntimeException {
    public CustomerPriceNotFound (String mess){
        super(mess);
    }
}
