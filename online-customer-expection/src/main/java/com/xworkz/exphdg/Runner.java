package com.xworkz.exphdg;

import com.xworkz.exphdg.dto.CustomerDto;
import com.xworkz.exphdg.expection.CustomerItemNotFound;
import com.xworkz.exphdg.expection.CustomerNameNotFound;

import com.xworkz.exphdg.expection.CustomerPriceNotFound;

public class Runner {
    public static void main(String[] args) {
        String name = getCustomerNameByID(2);
        System.out.println(name);
       String item = getCustomerItemByID(2);
       System.out.println(item);
       String price = getCustomerPriceByID(2);
       System.out.println(price);
    }
    public static String getCustomerNameByID(int id){
        System.out.println("getCustomerNameByID Started");
        String CName = null;
        try {
            CustomerDto dto = new CustomerDto();
            dto.setId(1);
            dto.setName("baba");
            if (dto.getId() == id) {
                CName= dto.getName();
            }else{
                CustomerNameNotFound customerNameNotFound= new CustomerNameNotFound("The present input name is not matching the id");
                throw customerNameNotFound;
            }
        }catch (CustomerNameNotFound cnnf){
            cnnf.printStackTrace();
        }
        System.out.println("getCustomerNameByID ended");
        return CName;
    }

    public static String getCustomerItemByID(int id){
        System.out.println("getCustomerItemByID started");
        String Citem=null;
        try {
            CustomerDto dt = new CustomerDto();
            dt.setId(1);
            dt.setItem("Bat");
            if (dt.getId() == id) {
                Citem= dt.getItem();
            }else{
                throw new CustomerItemNotFound("the present item input is not matching with id");
            }
        }catch (CustomerItemNotFound cinf){
            cinf.printStackTrace();
        }
        System.out.println("getCustomerItemByID ended");
        return Citem;
    }
    public static String getCustomerPriceByID(int id){
        System.out.println("getCustomerPriceByID started");
        String Cprize=null;
        try {
            CustomerDto dt = new CustomerDto();
            dt.setId(1);
            dt.setPrice("234");
            if (dt.getId() == id) {
                Cprize= dt.getPrice();
            }else{
                throw new CustomerPriceNotFound("the present Price input is not matching with id");
            }
        }catch (CustomerPriceNotFound cinf){
            cinf.printStackTrace();
        }
        System.out.println("getCustomerPriceByID ended");
        return Cprize;
    }
}
