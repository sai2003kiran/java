package com.xworkz.absclass.thirdcode;

import com.xworkz.absclass.thirdcode.function.Business;
import com.xworkz.absclass.thirdcode.malls.BangLulu;
import com.xworkz.absclass.thirdcode.malls.LuluMall;

public class Runner {
    public static void main(String[] args) {
        Business shop1999 = new BangLulu();
        shop1999.hotel();
        shop1999.jewelleryShop();
        shop1999.iceShop();
    }
}
