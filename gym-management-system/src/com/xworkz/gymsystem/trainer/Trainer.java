package com.xworkz.gymsystem.trainer;

public class Trainer {

    public int trainerId;
    public String trainerName;
    public String[] specializations;
    public double salary;

    public void trainerDetails() {
        System.out.println("Trainer Id: " + this.trainerId);
        System.out.println("Trainer Name: " + this.trainerName);
        for (String specialization : specializations) {
            System.out.println("Specialization: " + specialization);
        }
        System.out.println("Salary: Rs." + this.salary);
    }
}