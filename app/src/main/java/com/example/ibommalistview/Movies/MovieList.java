package com.example.ibommalistview.Movies;

public class MovieList {
    private String MovieName;
    private String Year;
    private String Cast;
    private String Director;
    private int Image;

    public MovieList(String movieName, String year, String cast, String director, int image) {
        MovieName = movieName;
        Year = year;
        Cast = cast;
        Director = director;
        Image = image;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getCast() {
        return Cast;
    }

    public void setCast(String cast) {
        Cast = cast;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
