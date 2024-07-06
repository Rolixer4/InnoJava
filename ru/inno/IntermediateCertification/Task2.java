package ru.inno.ru.inno.IntermediateCertification;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("Введите, сколько дней назад вы поливали кактус");
        int c = new Scanner(System.in).nextInt();
        Kaktus kaktus = new Kaktus(c);

        kaktus.nextWateringDay();
    }
}
