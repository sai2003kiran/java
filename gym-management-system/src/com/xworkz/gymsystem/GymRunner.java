package com.xworkz.gymsystem;
import com.xworkz.gymsystem.gym.Gym;
import com.xworkz.gymsystem.trainer.Trainer;

public class GymRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");

        String[] equipment = { "Treadmill", "Dumbbells", "Bench Press", "Rowing Machine" };
        String[] specializationsTrainer1 = { "Weight Training", "Cardio" };
        String[] specializationsTrainer2 = { "Yoga", "Zumba" };

        // Trainer class details:-
        Trainer[] trainers = new Trainer[2];

        Trainer trainer1 = new Trainer();
        trainer1.trainerId = 1;
        trainer1.trainerName = "John Smith";
        trainer1.specializations = specializationsTrainer1;
        trainer1.salary = 50000.00;
        trainer1.trainerDetails();

        Trainer trainer2 = new Trainer();
        trainer2.trainerId = 2;
        trainer2.trainerName = "Emily Davis";
        trainer2.specializations = specializationsTrainer2;
        trainer2.salary = 45000.00;
        trainer2.trainerDetails();

        trainers[0] = trainer1;
        trainers[1] = trainer2;

        // Gym class details:-
        Gym gym1 = new Gym();
        gym1.gymId = 101;
        gym1.gymName = "Xworkz Fitness Center";
        gym1.equipment = equipment;
        gym1.trainers = trainers;
        gym1.gymDetails();

        Gym gym2 = new Gym();
        gym2.gymId = 102;
        gym2.gymName = "Be Fit Gym";
        gym2.equipment = equipment;
        gym2.trainers = trainers;
        gym2.gymDetails();

        System.out.println("Main Ended");
    }
}