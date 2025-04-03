package com.xworkz.moviemanagement.movie;
import com.xworkz.moviemanagement.actor.Actor;

public class Movie {

    public int movieId;
    public String movieName;
    public String genre;
    public String[] theaters;
    public Actor[] actors;

    public void movieDetails() {
        System.out.println("Movie Id: " + this.movieId);
        System.out.println("Movie Name: " + this.movieName);
        System.out.println("Genre: " + this.genre);
        for (String theater : theaters) {
            System.out.println("Theater: " + theater);
        }
        for (Actor actor : actors) {
            actor.actorDetails();
        }
    }
}