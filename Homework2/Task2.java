package ru.inno.Homework2;

public class Task2 {

    public static void main(String[] args) {
        Flat flat1 = new Flat(3, 12, true, 8000000.0);
        Room room1 = new Room(3.0, 4.0, 2.5, "�������", true);
        Room room2 = new Room(3.0, 3.0, 2.5, "�������", true);
        Room room3 = new Room(5.0, 4.0, 2.5, "���", false);

        System.out.println("���������� ������ - " + flat1.numberOfRooms);
        System.out.println("���� - " + flat1.floor);
        System.out.println("�� ������� - " + flat1.isForSale);
        System.out.println("���� - " + flat1.price);
        System.out.println("������� 1 : " + "������ - " + room1.roomWidth + " ����� - " + room1.roomLength + " ������ - " + room1.roomHeight + " �������� ������� - " + room1.roomName + " ������� ������ - " + room1.isHasFurniture);
        System.out.println("������� 2 : " + " ������ - " + room2.roomWidth + " ����� - " + room2.roomLength + " ������ - " + room2.roomHeight + " �������� ������� - " + room2.roomName + " ������� ������ - " + room2.isHasFurniture);
        System.out.println("������� 3 : " + " ������ - " + room3.roomWidth + " ����� - " + room3.roomLength + " ������ - " + room3.roomHeight + " �������� ������� - " + room3.roomName + " ������� ������ - " + room3.isHasFurniture);
    }
}
