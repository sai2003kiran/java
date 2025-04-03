package com.xworkz.gymsystem.gym;
import com.xworkz.gymsystem.trainer.Trainer;

public class Gym {

    public int gymId;
    public String gymName;
    public String[] equipment;
    public Trainer[] trainers;

    public void gymDetails() {
        System.out.println("Gym Id: " + this.gymId);
        System.out.println("Gym Name: " + this.gymName);
        for (String equip : equipment) {
            System.out.println("Equipment: " + equip);
        }
        for (Trainer trainer : trainers) {
            trainer.trainerDetails();
        }
    }
}