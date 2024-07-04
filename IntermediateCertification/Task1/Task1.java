package ru.inno.IntermediateCertification.Task1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Введите длину забора");
        Scanner scanner = new Scanner(System.in);
        try {
            int fenceLength = scanner.nextInt();
            int countsOfChars = 0;
            int countsOfSpaces = 0;

            String declarationOfLove = "признание в любви ";

            for (char c : declarationOfLove.toCharArray()) {
                if (c == ' ') {
                    countsOfSpaces += 1;
                } else {
                    countsOfChars += 1;
                }
            }

            double math = (countsOfChars / 3) * 62 + countsOfSpaces * 12;

            if (math < fenceLength) {
                System.out.println("Шалость удалась!");
            } else {
                System.out.println("Все пропало! Длина забора " + fenceLength + ", а длина признания " + math);
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Ошибка! введите пожалуйста целочисленную длину забора");
        }
    }
}
