package ru.inno.ru.inno.IntermediateCertification;

import java.util.List;
import java.util.Scanner;

public class Game {
    private final List<String> arr = List.of("к", "н", "б");

    public void rps() {

        int scorePlayer = 0;
        int scoreComputer=0;
        Scanner c = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Введите значение к/н/б (Камень/ножницы/Бумага)");
            String choosePlayer = c.next();
            String chooseComputer = arr.get((int) (Math.random() * 3));
            System.out.println("Ваш выбор: " + choosePlayer + " Выбор компьютера: " + chooseComputer);

            switch (choosePlayer) {
                case "к" -> {
                    if (chooseComputer.equals("к")) {
                        i -= 1;
                        System.out.println("Ничья! Счет по очкам: компьютер " + scoreComputer + " Игрок " + scorePlayer);
                    } else if (chooseComputer.equals("н")) {
                        scorePlayer += 1;
                        System.out.println("Вы выиграли раунд! Счет по очкам: компьютер " + scoreComputer + " Игрок " + scorePlayer);

                    } else {
                        scoreComputer += 5;
                        System.out.println("Компьютер выиграл раунд! Счет по очкам: компьютер " + scoreComputer + " Игрок " + scorePlayer);
                    }
                }
                case "н" -> {
                    if (chooseComputer.equals("к")) {
                        scoreComputer += 1;
                        System.out.println("Компьютер выиграл раунд! Счет по очкам: компьютер " + scoreComputer + " Игрок " + scorePlayer);
                    } else if (chooseComputer.equals("н")) {
                        i -= 1;
                        System.out.println("Ничья! Счет по очкам: компьютер " + scoreComputer + " Игрок " + scorePlayer);
                    } else {
                        scorePlayer += 2;
                        System.out.println("Вы выиграли раунд! Счет по очкам: компьютер " + scoreComputer + " Игрок " + scorePlayer);
                    }
                }
                case "б" -> {
                    if (chooseComputer.equals("к")) {
                        scorePlayer += 5;
                        System.out.println("Вы выиграли раунд! Счет по очкам: компьютер " + scoreComputer + " Игрок " + scorePlayer);
                    } else if (chooseComputer.equals("н")) {
                        scoreComputer += 2;
                        System.out.println("Компьютер выиграл раунд! Счет по очкам: компьютер " + scoreComputer + " Игрок " + scorePlayer);
                    } else {
                        i -= 1;
                        System.out.println("Ничья! Счет по очкам: компьютер " + scoreComputer + " Игрок " + scorePlayer);
                    }
                }
                default -> {
                    i -= 1;
                }
            }
        }
        if (scoreComputer > scorePlayer) {
            System.out.println("Победил компьютер с результатом " + scoreComputer + " очков");
        } else if (scoreComputer < scorePlayer) {
            System.out.println("Вы победили с результатом " + scorePlayer + " очков");
        } else {
            System.out.println("Ничья");
        }
    }
}
