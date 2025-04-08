package com.xworkz.hospitalapp.record;

import com.xworkz.hospitalapp.dto.PatientDto;

public class Hospital {

    public boolean registerPatient(PatientDto patientDto) {
        boolean isRegistered = false;
        boolean isValid = validatePatient(patientDto);
        if (isValid) {
            isRegistered = true;
            System.out.println("Patient record registered successfully.");
        } else {
            System.out.println("Invalid patient details.");
        }
        return isRegistered;
    }

    public boolean validatePatient(PatientDto patientDto) {
        boolean isValid = false;

        boolean nameValid = patientDto.getPatientName() != null && !patientDto.getPatientName().isEmpty();
        boolean ageValid = patientDto.getAge() > 0;
        boolean dobValid = patientDto.getDob() != null && !patientDto.getDob().isEmpty();
        boolean genderValid = patientDto.getGender() != null && !patientDto.getGender().isEmpty();
        boolean emailValid = patientDto.getEmail() != null && !patientDto.getEmail().isEmpty();
        boolean contactValid = patientDto.getContactNumber() != null && !patientDto.getContactNumber().isEmpty();
        boolean bloodGroupValid = patientDto.getBloodGroup() != null;
        boolean diagnosisValid = patientDto.getDiagnosis() != null && !patientDto.getDiagnosis().isEmpty();

        if (!nameValid) System.out.println("Invalid Patient Name!");
        if (!ageValid) System.out.println("Invalid Age!");
        if (!dobValid) System.out.println("Invalid Date of Birth!");
        if (!genderValid) System.out.println("Invalid Gender!");
        if (!emailValid) System.out.println("Invalid Email!");
        if (!contactValid) System.out.println("Invalid Contact Number!");
        if (!bloodGroupValid) System.out.println("Invalid Blood Group!");
        if (!diagnosisValid) System.out.println("Invalid Diagnosis!");

        if (nameValid && ageValid && dobValid && genderValid && emailValid && contactValid && bloodGroupValid && diagnosisValid) {
            isValid = true;
        }

        return isValid;
    }
}
