package com.xworkz.fitnessapp.dto;

import com.xworkz.fitnessapp.constants.FitnessGoal;

public class FitnessUserProfileDto {

    private String userName;
    private String email;
    private int age;
    private double weight;
    private double height;
    private FitnessGoal goal;
    private String preferredWorkoutTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public FitnessGoal getGoal() {
        return goal;
    }

    public void setGoal(FitnessGoal goal) {
        this.goal = goal;
    }

    public String getPreferredWorkoutTime() {
        return preferredWorkoutTime;
    }

    public void setPreferredWorkoutTime(String preferredWorkoutTime) {
        this.preferredWorkoutTime = preferredWorkoutTime;
    }
}
