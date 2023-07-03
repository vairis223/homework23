package io.codelex.classesandobjects.practice;

public class Movie {

    private String title;
    private String studio;
   private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "";
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }

    public static Movie[] getPG(Movie[] movies) {
        int count = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                count++;
            }
        }
        Movie[] pgMovies = new Movie[count];
        int num = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgMovies[num] = movie;
                num++;
            }
        }
        return pgMovies;
    }
}
