package com.xworkz.amazon.encapsule;
import com.xworkz.amazon.data.AmazonDtoValidation;
import com.xworkz.amazon.fixed.Gender;

public class AmazonDataCapturing {
    AmazonDtoValidation dto;

    public boolean verification(AmazonDtoValidation amazonDtoValidation){
        boolean verify=false;
        boolean isFristName=false;
        boolean islastName=false;
        boolean isGender=false;
        boolean isPhno=false;
        boolean isEmail=false;
        boolean isPassWord=false;

        if (amazonDtoValidation.getFristName()!= null && amazonDtoValidation.getFristName().length()>3) {
            isFristName=true;
        }else System.out.println("invalid fristname");

        if (amazonDtoValidation.getLastName()!= null && amazonDtoValidation.getLastName().length()>=1 && amazonDtoValidation.getLastName().length()<3) {
            islastName=true;
        }else System.out.println("invalid lastname");

        if (amazonDtoValidation.getPhoneNumber().length() == 10) {
            isPhno=true;
        }else System.out.println("invalid number");

        if (amazonDtoValidation.getEmail()!= null && amazonDtoValidation.getEmail().length()>6) {
            isEmail=true;
        }else System.out.println("invalid Email");

        if (amazonDtoValidation.getEmail()!= null && amazonDtoValidation.getEmail().length()>6) {
            isPassWord=true;
        }else System.out.println("invalid password");

        if (amazonDtoValidation.getGender()==Gender.female || amazonDtoValidation.getGender()==Gender.male) {
            isGender=true;
        }else System.out.println("invalid gender");

        if (isPassWord && isEmail && isFristName && islastName && isPhno && isGender) {
            verify=true;
        } else System.out.println("user input is inCorrect");

        return verify;
    }

    public void userRegisteration(AmazonDtoValidation amazonDtoValidation){
        boolean valid = verification(amazonDtoValidation);
        boolean verify = false;
        if (valid) {
            verify=true;
            dto = amazonDtoValidation;
        }else System.out.println("user registeration is unsuccessful");
    }

    public void displayDetails(){
        System.out.println("user details");
        System.out.println("User Frist Name is :"+dto.getFristName());
        System.out.println("User Last Name is :"+dto.getLastName());
        System.out.println("User Phone number is :"+dto.getPhoneNumber());
        System.out.println("User Gender is : "+dto.getGender());
        System.out.println("User Email Address is :"+dto.getEmail());
        System.out.println("User PassWord is :"+dto.getPassword());
        System.out.println("User registeration is Successful");

    }

}
