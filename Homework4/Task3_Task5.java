package ru.inno.Homework4;

public class Task3_Task5 {

    public static void main(String[] args) {

        Movie[] films = {
                new Movie("Limitless", 7, "Thriller", "USA", false, 2011),
                new Movie("Van Helsing", 5, "Fantasy/Adventure/Action", "USA", false, 2004),
                new Movie("Django Unchained", 9, "Western/Drama/Action", "USA", true, 2012)
        };


        for (int i = 0; i < films.length; i++){

            System.out.println(films[i].year + " " + films[i].name + " " + films[i].genre + " " + films[i].rating + " " + films[i].country + " " + (films[i].isHaveOscar ? "Есть" : "Нет"));
        }
    }

}
