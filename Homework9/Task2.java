package ru.inno.Homework9;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {


        ArrayList<String> List = new ArrayList<>();
        List.add("Пресс качат");
        List.add("Бегит");
        List.add("Турник");
        List.add("Анжуманя");
        List.add("Репит");

        for (String lists: List) {
            int i = 1;
            System.out.println("Задача " + i + ": " +lists);
        }

    }
}
