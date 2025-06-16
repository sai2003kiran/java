package com.xworkz.absclass.secondcode.unionbank;

import com.xworkz.absclass.secondcode.function.Card;

public abstract class Union implements Card {
    @Override
    public void insert() {
        System.out.println("this can be inserted to UNION atm machine");
    }

    @Override
    public void tap() {
        System.out.println("this can be debited from bankAcc without UPI");
    }


}
