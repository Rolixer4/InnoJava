package ru.inno;

import java.util.Locale;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String name = "Никита";
        String longTern = "asdadgsdfjklghersuilfgjhndfg";
        String empty = "";
        String blank = " ";
        String nullString = null ;

        String veryLongTerm = new Scanner(System.in).nextLine();

        System.out.println(veryLongTerm);
        System.out.println(name + "учится автоматизировать");
        System.out.println(name.length());
        System.out.println(blank.length());

        System.out.println(name.toUpperCase());
        System.out.println(name.equals("Никита"));
    }
}
