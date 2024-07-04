package ru.inno.Homework9;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task3 {

    public static void main(String[] args) {


        ArrayList<Movie> films = new ArrayList<>();
        films.add(new Movie("Limitless", 8, "Thriller", "USA", false, 2011));
        films.add(new Movie("Van Helsing", 5, "Fantasy/Adventure/Action", "USA", false, 2004));
        films.add(new Movie("Django Unchained", 9, "Western/Drama/Action", "USA", true, 2012));

        System.out.println(films.get(1));
    }


}
