package ru.inno.IntermediateCertification.Task1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Введите длину забора");
        Scanner scanner = new Scanner(System.in);
        int fenceLength = scanner.nextInt();

        int countsOfChars = 0;
        int countsOfSpaces = 0;

        String declarationOfLove = "признание в любви";

        for (char c : declarationOfLove.toCharArray()) {
            if (c == ' ') {
                countsOfSpaces += 1;
            } else {
                countsOfChars += 1;
            }
        }
        System.out.println(countsOfChars);
    }
}
