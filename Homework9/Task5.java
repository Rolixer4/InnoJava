package ru.inno.Homework9;

import java.util.HashMap;
import java.util.Map;

public class Task5 {

    public static void main(String[] args) {

        Map<Player, Integer> players = new HashMap<>();

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
        Player player11 = new Player(0, "�������� �����", true);

        players.put(player1, 0);
        players.put(player2, 1);
        players.put(player3, 2);
        players.put(player4, 3);
        players.put(player5, 4);
        players.put(player6, 5);
        players.put(player7, 6);
        players.put(player8, 7);
        players.put(player9, 8);
        players.put(player10, 9);
        players.put(player11, 11);

        for (Player player : players.keySet()) {

            System.out.println(player);
        }
    }
}
