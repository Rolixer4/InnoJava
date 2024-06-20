package ru.inno.Homework9;

import java.util.Objects;

public class Movie {
    private String name;
    private int rating;
    private String genre;
    private String country;
    private boolean isHaveOscar;
    private int year;

    public Movie(String name, int rating, String genre, String country, boolean isHaveOscar, int year) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.isHaveOscar = isHaveOscar;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", isHaveOscar=" + isHaveOscar +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isHaveOscar() {
        return isHaveOscar;
    }

    public void setHaveOscar(boolean haveOscar) {
        isHaveOscar = haveOscar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return rating == movie.rating && isHaveOscar == movie.isHaveOscar && year == movie.year && Objects.equals(name, movie.name) && Objects.equals(genre, movie.genre) && Objects.equals(country, movie.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, genre, country, isHaveOscar, year);
    }
}
