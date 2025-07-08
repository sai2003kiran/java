package com.xworkz.jdbc;

import com.xworkz.jdbc.dto.UserDto;
import com.xworkz.jdbc.service.UserSerive;
import com.xworkz.jdbc.service.imple.UserServImple;

public class Runner {
    public static void main(String[] args) {
//
//        UserDto dto = new UserDto();
//        dto.setAccountName("Sai");
//        dto.setAccountType("Saving Account");
//        dto.setAddress("Bangalore");
//
//        UserDto dto1 = new UserDto();
//        dto1.setAccountName("likith");
//        dto1.setAccountType("current Account");
//        dto1.setAddress("hydrabad");
//
//        UserDto dto2 = new UserDto();
//        dto2.setAccountName("uday");
//        dto2.setAccountType("current Account");
//        dto2.setAddress("pune");
//
//
//        UserSerive serive = new UserServImple();
////        serive.validate(dto);
//        serive.validate(dto2);

//         UserSerive serive = new UserServImple();
//        serive.update(2,"current account");
        UserSerive serive = new UserServImple();
        serive.delete(2);


    }
}
