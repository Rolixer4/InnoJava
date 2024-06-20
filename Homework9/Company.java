package ru.inno.Homework9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Company {

    private String name;
    private int year;
    private List<Movie> films;

    public Company(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return year == company.year && Objects.equals(name, company.name) && Objects.equals(films, company.films);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, films);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", films=" + films +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Movie> getFilms() {
        return films;
    }

    public void setFilms(List<Movie> films) {
        this.films = films;
    }
}
