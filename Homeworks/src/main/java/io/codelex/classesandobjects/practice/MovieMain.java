package io.codelex.classesandobjects.practice;

import static io.codelex.classesandobjects.practice.Movie.getPG;

public class MovieMain {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG-13");

        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG-13");

        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");


        Movie[] movies = {movie1, movie2, movie3};


        Movie[] pgMovies = getPG(movies);

        for (Movie movie : pgMovies) {

            System.out.println(movie.getTitle());
        }

    }
}
