package ru.inno.Homework9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {


        List<Company> companies = new LinkedList<>();
        companies.add(0, new Company("MGM"));
        companies.add(1, new Company("Disney"));
        companies.add(2, new Company("Columbia"));

        List<Movie> mgmMovie = new LinkedList<>();
        List<Movie> disneyMovie = new LinkedList<>();
        List<Movie> columbiaMovie = new LinkedList<>();

        mgmMovie.add(new Movie("Хоббит: Нежданное путешествие", 8, "", "", false, 2012));
        mgmMovie.add(new Movie("007: Координаты \"Скайфолл\"", 8, "", "", false, 2012));
        mgmMovie.add(new Movie("Гнев человеческий", 8, "", "", false, 2021));

        disneyMovie.add(new Movie("Зверополис", 8, "", "", false, 2016));
        disneyMovie.add(new Movie("Первый мститель: Противостояние", 8, "", "", false, 2016));
        disneyMovie.add(new Movie("Пираты Карибского моря: Мертвецы не рассказывают сказки", 8, "", "", false, 2017));

        columbiaMovie.add(new Movie("Человек-паук: Возвращение домой", 8, "", "", false, 2017));
        columbiaMovie.add(new Movie("Бегущий по лезвию 2049", 8, "", "", false, 2017));
        columbiaMovie.add(new Movie("Новый Человек-паук", 8, "", "", false, 2012));

        companies.get(0).setFilms(mgmMovie);
        companies.get(1).setFilms(disneyMovie);
        companies.get(2).setFilms(columbiaMovie);


        for (Company company : companies) {
            String companyName = company.getName();
            System.out.print(companyName + ": ");
            for (Movie currentMovie : company.getFilms()) {
                System.out.print(currentMovie.getName() + ". ");
            }
            System.out.println();
        }
    }
}
