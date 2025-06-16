package com.xworkz.absclass.secondcode;

import com.xworkz.absclass.secondcode.canarabank.Canara;
import com.xworkz.absclass.secondcode.function.Card;
import com.xworkz.absclass.secondcode.unionbank.BangaloreUnion;

public class Runner {
    public static void main(String[] args) {
        Card bank1 = new BangaloreUnion();
        bank1.insert();
        bank1.tap();
        Card bank2 = new Canara();
        bank2.insert();
        bank2.tap();
        bank2.swipe();
    }
}
