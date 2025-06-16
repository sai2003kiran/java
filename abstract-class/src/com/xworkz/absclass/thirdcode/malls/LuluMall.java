package com.xworkz.absclass.thirdcode.malls;

import com.xworkz.absclass.thirdcode.function.Business;

public abstract class LuluMall implements Business {
    @Override
    public void jewelleryShop() {
        System.out.println("this can seen in right side");
    }

    @Override
    public void hotel() {
        System.out.println("this can seen in left side");
    }
}
