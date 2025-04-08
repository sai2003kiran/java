package com.xworkz.studentapp.managestudent;

import com.xworkz.studentapp.studentdto.StudentDto;

public class Student {

    public boolean registerStudent(StudentDto studentDto) {
        boolean isRegistered = false;
        boolean validated = validateStudent(studentDto);
        if (validated) {
            isRegistered = true;
        } else {
            System.out.println("Student details are invalid...");
        }
        return isRegistered;
    }

    public boolean validateStudent(StudentDto studentDto) {

        boolean validated = false;
        boolean nameValid = false;
        boolean rollValid = false;
        boolean dobValid = false;
        boolean genderValid = false;
        boolean emailValid = false;
        boolean mobileValid = false;
        boolean deptValid = false;
        boolean percentageValid = false;

        if (studentDto.getStudentName() != null && !studentDto.getStudentName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("Invalid Student Name!");
        }

        if (studentDto.getRollNumber() > 0) {
            rollValid = true;
        } else {
            System.out.println("Invalid Roll Number!");
        }

        if (studentDto.getDob() != null && !studentDto.getDob().isEmpty()) {
            dobValid = true;
        } else {
            System.out.println("Invalid DOB!");
        }

        if (studentDto.getGender() != null) {
            genderValid = true;
        } else {
            System.out.println("Invalid Gender!");
        }

        if (studentDto.getEmail() != null && !studentDto.getEmail().isEmpty()) {
            emailValid = true;
        } else {
            System.out.println("Invalid Email!");
        }

        if (studentDto.getMobile() != null && !studentDto.getMobile().isEmpty()) {
            mobileValid = true;
        } else {
            System.out.println("Invalid Mobile!");
        }

        if (studentDto.getDepartment() != null && !studentDto.getDepartment().isEmpty()) {
            deptValid = true;
        } else {
            System.out.println("Invalid Department!");
        }

        if (studentDto.getPercentage() >= 0 && studentDto.getPercentage() <= 100) {
            percentageValid = true;
        } else {
            System.out.println("Invalid Percentage!");
        }

        if (nameValid && rollValid && dobValid && genderValid && emailValid &&
                mobileValid && deptValid && percentageValid) {
            validated = true;
        }

        return validated;
    }
}
