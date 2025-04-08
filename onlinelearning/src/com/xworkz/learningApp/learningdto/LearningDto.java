package com.xworkz.learningApp.learningdto;

import com.xworkz.learningApp.Constants.Payment;
import com.xworkz.learningApp.Constants.Course;

public class LearningDto {
    private String name;
    private String email;
    private long phnNo;
    private Course courseType;
    private Payment paymentType;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public long getPhnNo(){
        return phnNo;
    }
    public void setPhnNo(long phnNo){
        this.phnNo = phnNo;
    }

    public Course getCourseType(){
        return courseType;
    }
    public void setCourseType(Course courseType){
        this.courseType = courseType;
    }

    public Payment getPaymentType(){
        return paymentType;
    }
    public void setPaymentType(Payment paymentType){
        this.paymentType = paymentType;
    }
}
