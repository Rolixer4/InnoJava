package ru.inno.Homework4;

public class Movie {

    String name;
    int rating;
    String genre;
    String country;
    boolean isHaveOscar;

    int year;

    public Movie(String name, int rating, String genre, String country, boolean isHaveOscar, int year) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.isHaveOscar = isHaveOscar;
        this.year = year;
    }
}
