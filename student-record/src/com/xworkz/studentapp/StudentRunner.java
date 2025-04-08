package com.xworkz.studentapp;

import com.xworkz.studentapp.constants.Gender;
import com.xworkz.studentapp.studentdto.StudentDto;
import com.xworkz.studentapp.managestudent.Student;

public class StudentRunner {

    public static void main(String[] args) {

        System.out.println("----------------------------------");

        StudentDto studentDto = new StudentDto();
        studentDto.setStudentName("Meghana");
        studentDto.setRollNumber(123);
        studentDto.setDob("12/09/2002");
        studentDto.setGender(Gender.female);
        studentDto.setEmail("meghana@gmail.com");
        studentDto.setMobile("9876543210");
        studentDto.setDepartment("Computer Science");
        studentDto.setPercentage(87.5);

        System.out.println("Student Name: " + studentDto.getStudentName());
        System.out.println("Roll Number: " + studentDto.getRollNumber());
        System.out.println("DOB: " + studentDto.getDob());
        System.out.println("Gender: " + studentDto.getGender());
        System.out.println("Email: " + studentDto.getEmail());
        System.out.println("Mobile: " + studentDto.getMobile());
        System.out.println("Department: " + studentDto.getDepartment());
        System.out.println("Percentage: " + studentDto.getPercentage());

        System.out.println("----------------------------------");

        Student student = new Student();
        student.registerStudent(studentDto);
    }
}
