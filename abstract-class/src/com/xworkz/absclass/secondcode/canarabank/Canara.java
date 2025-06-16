package com.xworkz.absclass.secondcode.canarabank;

import com.xworkz.absclass.secondcode.function.Card;

public class Canara implements Card {
    @Override
    public void insert() {
        System.out.println("this can be inserted to CANARA atm machine");
    }

    @Override
    public void tap() {
        System.out.println("This can be debited from bankAcc without UPI");
    }

    @Override
    public void swipe() {
        System.out.println("this can be debited from bankAcc without atm");
    }
}
