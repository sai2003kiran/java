package com.xworkz.exp;

import com.xworkz.exp.dto.StudentDto;
import com.xworkz.exp.expection.StudentAddressNotFound;
import com.xworkz.exp.expection.StudentAgeNotFound;
import com.xworkz.exp.expection.StudentNameNotFound;

public class Runner {
    public static void main(String[] args) {
        System.out.println(getStudentAgebyId(3));
        System.out.println(getStudentNamebyId(3));
        System.out.println(getStudentAddressbyId(3));
    }
    public static String getStudentAgebyId(int id){
        String age = null;
        try{
            StudentDto dto = new StudentDto();
            dto.setId(1);
            dto.setAge("34");
            if (dto.getId() == id) {
                age= dto.getName();
            }else{
                throw new StudentAgeNotFound("invalid age");
            }
        }catch (StudentAgeNotFound sa){
            sa.printStackTrace();
        }
        return age;
    }

    public static String getStudentAddressbyId(int id){
        String adr = null;
        try{
            StudentDto dto = new StudentDto();
            dto.setId(1);
            dto.setName("sai");
            if (dto.getId() == id) {
                adr= dto.getName();
            }else{
                throw new StudentAddressNotFound("invalid address");
            }
        }catch (StudentAddressNotFound sn){
            sn.printStackTrace();
        }
        return adr;
    }

    public static String getStudentNamebyId(int id){
        String name = null;
        try{
            StudentDto dto = new StudentDto();
            dto.setId(1);
            dto.setName("sai");
            if (dto.getId() == id) {
                name= dto.getName();
            }else{
                throw new StudentNameNotFound("invalid name");
            }
        }catch (StudentNameNotFound sn){
            sn.printStackTrace();
        }
        return name;
    }
}
