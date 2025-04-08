package com.xworkz.collegeregistration.service;

import com.xworkz.collegeregistration.dto.CourseRegistrationDto;

public class CourseRegistration {

    public boolean registerStudent(CourseRegistrationDto dto) {
        boolean isRegistered = false;
        boolean validated = validateRegistration(dto);
        if (validated) {
            isRegistered = true;
            System.out.println("Student registered successfully!");
        } else {
            System.out.println("Registration failed due to invalid details.");
        }
        return isRegistered;
    }

    public boolean validateRegistration(CourseRegistrationDto dto) {

        boolean nameValid = dto.getStudentName() != null && !dto.getStudentName().isEmpty();
        boolean idValid = dto.getStudentId() != null && !dto.getStudentId().isEmpty();
        boolean courseNameValid = dto.getCourseName() != null && !dto.getCourseName().isEmpty();
        boolean courseCodeValid = dto.getCourseCode() != null && !dto.getCourseCode().isEmpty();
        boolean departmentValid = dto.getDepartment() != null && !dto.getDepartment().isEmpty();
        boolean semesterValid = dto.getSemester() != null && !dto.getSemester().isEmpty();
        boolean emailValid = dto.getEmail() != null && !dto.getEmail().isEmpty();
        boolean contactValid = dto.getContactNumber() != null && !dto.getContactNumber().isEmpty();

        if (!nameValid) System.out.println("Invalid Student Name!");
        if (!idValid) System.out.println("Invalid Student ID!");
        if (!courseNameValid) System.out.println("Invalid Course Name!");
        if (!courseCodeValid) System.out.println("Invalid Course Code!");
        if (!departmentValid) System.out.println("Invalid Department!");
        if (!semesterValid) System.out.println("Invalid Semester!");
        if (!emailValid) System.out.println("Invalid Email!");
        if (!contactValid) System.out.println("Invalid Contact Number!");

        return nameValid && idValid && courseNameValid && courseCodeValid && departmentValid &&
                semesterValid && emailValid && contactValid;
    }
}
