package ru.inno.Homework2;

public class Task3 {

    public static void main(String[] args) {

        Item item1 = new Item("Кофе-машина", "K4_d1_c2", 41999.99, 21, "Красный", true);
        Item item2 = new Item("Телевизор", "T1_d3_c1", 48999, 56, "Черный", true);
        Item item3 = new Item("Холодильник", "R99_d15_c4", 59999, 72, "Серый", true);
        Item item4 = new Item("Игровая приставка", "S5_d12_c41", 54999, 8, "Синий", true);
        Item item5 = new Item("Ноутбук", "A104_d83_c1", 109999, 0, "Циан", false);

        System.out.println("\u001B[31m" + "Артикул " + item1.vendorCode + " название - " + item1.name + " цена - " + item1.price + " количество - " + item1.quantity + " Цвет - " + item1.color + " наличие - " + (item1.isInStock ? "В наличии" : "Под заказ"));
        System.out.println("\u001B[30m" + "Артикул " + item2.vendorCode + " название - " + item2.name + " цена - " + item2.price + " количество - " + item2.quantity + " Цвет - " + item2.color + " наличие - " + (item2.isInStock ? "В наличии" : "Под заказ"));
        System.out.println("\u001B[37m" + "Артикул " + item3.vendorCode + " название - " + item3.name + " цена - " + item3.price + " количество - " + item3.quantity + " Цвет - " + item3.color + " наличие - " + (item3.isInStock ? "В наличии" : "Под заказ"));
        System.out.println("\u001B[34m" + "Артикул " + item4.vendorCode + " название - " + item4.name + " цена - " + item4.price + " количество - " + item4.quantity + " Цвет - " + item4.color + " наличие - " + (item4.isInStock ? "В наличии" : "Под заказ"));
        System.out.println("\u001B[36m" + "Артикул " + item5.vendorCode + " название - " + item5.name + " цена - " + item5.price + " количество - " + item5.quantity + " Цвет - " + item5.color + " наличие - " + (item5.isInStock ? "В наличии" : "Под заказ"));

    }
}
