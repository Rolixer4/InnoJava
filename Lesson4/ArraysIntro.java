package ru.inno.Lesson4;

public class ArraysIntro {
    public static void main(String[] args) {
        int x = 1;

        int[] marks = new int[10];

        String[] names = new String[5];

        names[0] = "������";
        names[1] = "����";
        names[2] = "������";
        names[3] = "������";
        names[4] = "�������";


        long[] numbers = new long[16];

        System.out.println(names[1]);

        int[] a1 = new int[5];
        int[] a2 = new int[]{1, 2, 3, 4, 5, 6};
        int[] a3 = {1, 2, 3, 4, 5, 6, 7};
    }
}
