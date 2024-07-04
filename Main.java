package ru.inno;

public class Main {
    public static void main(String[] args) {
        // ключевое слово - объявляем переменную
        // имя переменной
        //    значение
        var balance = 100;
        var userName = 1;
        var birthDate = 2;
        var incomingMails = 3;
        var x = 1289543;
        byte myAge = 120; // 255 - > 11111111 [1 байт = 8 бит]
        short bookPagesCount = 200; // 32500 -> 11111111 11111111 [2 байта = 16 бит]
        int russiaPopulation = 2053492059; // [4 байта] 2 миллиарда +
        long theWorldPopulation = 800_00000_0000L; // 10 в 18 степени байта

        float piFloat = 3.14f; // [4 байта]
        double piDouble = 3.14; // [8 байт]

        boolean isActive = true; // false [1 bit]

        char f = 'F';

        int a = 10;
        int b = 15;

        var c = a + b;

        System.out.println(c);
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b-5);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);


        System.out.println(balance);

    }
}
