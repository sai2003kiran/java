package com.xworkz.collegeregistration;

import com.xworkz.collegeregistration.dto.CourseRegistrationDto;
import com.xworkz.collegeregistration.service.CourseRegistration;

public class CourseRegistrationRunner {

    public static void main(String[] args) {

        CourseRegistrationDto dto = new CourseRegistrationDto();
        dto.setStudentName("Akhil Raj");
        dto.setStudentId("S123456");
        dto.setCourseName("Data Structures");
        dto.setCourseCode("CS201");
        dto.setDepartment("Computer Science");
        dto.setSemester("4th");
        dto.setEmail("akhil.raj@example.com");
        dto.setContactNumber("9876543210");

        System.out.println("----- Student Details -----");
        System.out.println("Name: " + dto.getStudentName());
        System.out.println("ID: " + dto.getStudentId());
        System.out.println("Course: " + dto.getCourseName());
        System.out.println("Code: " + dto.getCourseCode());
        System.out.println("Department: " + dto.getDepartment());
        System.out.println("Semester: " + dto.getSemester());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Contact: " + dto.getContactNumber());
        System.out.println("---------------------------");

        CourseRegistration registration = new CourseRegistration();
        registration.registerStudent(dto);
    }
}
