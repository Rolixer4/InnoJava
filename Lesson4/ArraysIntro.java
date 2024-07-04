package ru.inno.Lesson4;

public class ArraysIntro {
    public static void main(String[] args) {
        int x = 1;

        int[] marks = new int[10];

        String[] names = new String[5];

        names[0] = "Галина";
        names[1] = "Петр";
        names[2] = "Никита";
        names[3] = "Данила";
        names[4] = "Алексей";


        long[] numbers = new long[16];

        System.out.println(names[1]);

        int[] a1 = new int[5];
        int[] a2 = new int[]{1, 2, 3, 4, 5, 6};
        int[] a3 = {1, 2, 3, 4, 5, 6, 7};
    }
}
