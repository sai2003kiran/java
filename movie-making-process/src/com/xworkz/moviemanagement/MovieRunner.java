package com.xworkz.moviemanagement;
import com.xworkz.moviemanagement.movie.Movie;
import com.xworkz.moviemanagement.actor.Actor;

public class MovieRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");

        String[] theaters = { "PVR Cinemas", "INOX", "Cinepolis" };
        String[] moviesByActor1 = { "Inception", "The Dark Knight", "Interstellar" };
        String[] moviesByActor2 = { "Titanic", "Avatar", "The Revenant" };

        // Actor class details:-
        Actor[] actors = new Actor[2];

        Actor actor1 = new Actor();
        actor1.actorId = 1;
        actor1.actorName = "Leonardo DiCaprio";
        actor1.movies = moviesByActor2;
        actor1.salary = 1000000.00;
        actor1.actorDetails();

        Actor actor2 = new Actor();
        actor2.actorId = 2;
        actor2.actorName = "Christian Bale";
        actor2.movies = moviesByActor1;
        actor2.salary = 900000.00;
        actor2.actorDetails();

        actors[0] = actor1;
        actors[1] = actor2;

        // Movie class details:-
        Movie movie1 = new Movie();
        movie1.movieId = 1;
        movie1.movieName = "Inception";
        movie1.genre = "Sci-Fi";
        movie1.theaters = theaters;
        movie1.actors = actors;
        movie1.movieDetails();

        Movie movie2 = new Movie();
        movie2.movieId = 2;
        movie2.movieName = "Titanic";
        movie2.genre = "Romance";
        movie2.theaters = theaters;
        movie2.actors = actors;
        movie2.movieDetails();

        System.out.println("Main Ended");
    }
}