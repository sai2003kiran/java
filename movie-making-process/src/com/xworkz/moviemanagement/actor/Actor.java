package com.xworkz.moviemanagement.actor;

public class Actor {

    public int actorId;
    public String actorName;
    public String[] movies;
    public double salary;

    public void actorDetails() {
        System.out.println("Actor Id: " + this.actorId);
        System.out.println("Actor Name: " + this.actorName);
        for (String movie : movies) {
            System.out.println("Movie: " + movie);
        }
        System.out.println("Salary: Rs." + this.salary);
    }
}