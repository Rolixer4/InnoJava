package ru.inno.Homework9;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Task6 {

    public static void main(String[] args) {

        Map<Player, Integer> points = new HashMap<>();

        Player player1 = new Player(0, "�������� �����", true);
        Player player2 = new Player(1, "�������� �����", true);
        Player player3 = new Player(2, "�������� ������", true);
        Player player4 = new Player(3, "�������� �����", true);
        Player player5 = new Player(4, "�������� �����", true);
        Player player6 = new Player(5, "�������� �����", true);
        Player player7 = new Player(6, "�������� �����", true);
        Player player8 = new Player(7, "�������� �����", true);
        Player player9 = new Player(8, "�������� �����", true);
        Player player10 = new Player(9, "�������� �����", true);

        points.put(player1, 0);
        points.put(player2, 0);
        points.put(player3, 0);
        points.put(player4, 10);
        points.put(player5, 0);
        points.put(player6, 0);
        points.put(player7, 12);
        points.put(player8, 11);
        points.put(player9, 13);
        points.put(player10, 5);

        points.entrySet()
                .stream().sorted(Map.Entry.<Player, Integer>comparingByValue().reversed()).limit(3).forEach(System.out::println);
    }
}
