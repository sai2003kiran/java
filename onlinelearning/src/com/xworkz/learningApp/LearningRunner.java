package com.xworkz.learningApp;

import com.xworkz.learningApp.Constants.Course;
import com.xworkz.learningApp.Constants.Payment;
import com.xworkz.learningApp.learning.Learning;
import com.xworkz.learningApp.learningdto.LearningDto;

public class LearningRunner {
    public static void main(String arg[]){

        LearningDto learningDto = new LearningDto();
        learningDto.setEmail("bgsu335");
        learningDto.setName("mjutes");
        learningDto.setPhnNo(5638298643l);
        learningDto.setPaymentType(Payment.online);
        learningDto.setCourseType(Course.java);

        Learning bank = new Learning();
        if(bank.User(learningDto)){
            System.out.println("successfull");
        }
        else
            System.out.println("unsuccesfull");
    }
}
