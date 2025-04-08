package com.xworkz.fitnessapp;

import com.xworkz.fitnessapp.constants.FitnessGoal;
import com.xworkz.fitnessapp.dto.FitnessUserProfileDto;
import com.xworkz.fitnessapp.generate.FitnessApp;

public class FitnessAppRunner {

    public static void main(String[] args) {

        System.out.println("----------------------------------");

        FitnessUserProfileDto dto = new FitnessUserProfileDto();
        dto.setUserName("Rahul Sharma");
        dto.setEmail("rahul.fitness@gmail.com");
        dto.setAge(28);
        dto.setWeight(72.5);
        dto.setHeight(5.9);
        dto.setGoal(FitnessGoal.MUSCLE_GAIN);
        dto.setPreferredWorkoutTime("Morning");

        System.out.println("User Name: " + dto.getUserName());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Age: " + dto.getAge());
        System.out.println("Weight: " + dto.getWeight());
        System.out.println("Height: " + dto.getHeight());
        System.out.println("Fitness Goal: " + dto.getGoal());
        System.out.println("Workout Time: " + dto.getPreferredWorkoutTime());

        System.out.println("----------------------------------");

        FitnessApp app = new FitnessApp();
        app.registerUser(dto);
    }
}
