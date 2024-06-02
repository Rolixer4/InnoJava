package ru.inno.Homework2;

public class Task2 {

    public static void main(String[] args) {
        Flat flat1 = new Flat(3, 12, true, 8000000.0);
        Room room1 = new Room(3.0, 4.0, 2.5, "Спальня", true);
        Room room2 = new Room(3.0, 3.0, 2.5, "Детская", true);
        Room room3 = new Room(5.0, 4.0, 2.5, "Зал", false);

        System.out.println("количество комнат - " + flat1.numberOfRooms);
        System.out.println("Этаж - " + flat1.floor);
        System.out.println("На продаже - " + flat1.isForSale);
        System.out.println("Цена - " + flat1.price);
        System.out.println("Комната 1 : " + "Ширина - " + room1.roomWidth + " Длина - " + room1.roomLength + " Высота - " + room1.roomHeight + " Название комнаты - " + room1.roomName + " Наличие мебели - " + room1.isHasFurniture);
        System.out.println("Комната 2 : " + " Ширина - " + room2.roomWidth + " Длина - " + room2.roomLength + " Высота - " + room2.roomHeight + " Название комнаты - " + room2.roomName + " Наличие мебели - " + room2.isHasFurniture);
        System.out.println("Комната 3 : " + " Ширина - " + room3.roomWidth + " Длина - " + room3.roomLength + " Высота - " + room3.roomHeight + " Название комнаты - " + room3.roomName + " Наличие мебели - " + room3.isHasFurniture);
    }
}
