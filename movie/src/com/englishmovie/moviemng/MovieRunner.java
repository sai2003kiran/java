package com.englishmovie.moviemng;

import com.englishmovie.moviemng.movie.Movie;
import com.englishmovie.moviemng.genre.Genre;
import com.englishmovie.moviemng.actor.Actor;

public class MovieRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        // Creating actors for Action genre
        Actor actor1 = new Actor();
        actor1.actorId=101;
        actor1.actorName="Tom Cruise";
        Actor actor2 = new Actor();
        actor2.actorId=102;
        actor2.actorName="Keanu Reeves";


        // Creating actors for Comedy genre
        Actor actor3 = new Actor();
        actor3.actorId=201;
        actor3.actorName="Jim Carrey";
        Actor actor4 = new Actor();
        actor4.actorId=202;
        actor4.actorName="Will Ferrell";

        // Creating genres
        Genre actionGenre = new Genre();
        actionGenre.genreId =1;
        actionGenre.genreName ="Action";
        actionGenre.actors = new Actor[]{actor1, actor2};

        Genre comedyGenre = new Genre();
        actionGenre.genreId =2;
        actionGenre.genreName ="Comedy";
        actionGenre.actors = new Actor[]{actor3, actor4};

        Genre movieGenre[] ={actionGenre,comedyGenre};

        // Creating movies
        Movie movie1 = new Movie();
        movie1.movieId=1;
        movie1.genre = movieGenre;
        movie1.movieName="Mission Impossible";

        Movie movie2 = new Movie();
        movie2.movieId=2;
        movie2.movieName="Dumb and Dumber";
        movie2.genre = movieGenre;

        Movie[] movies = {movie1, movie2};

        movie1.displayMovie();
        for (Movie movie : movies) {
            movie.displayMovie();
        }


    }
}