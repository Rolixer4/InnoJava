package ru.inno.Homework2;

public class Task3 {

    public static void main(String[] args) {

        Item item1 = new Item("����-������", "K4_d1_c2", 41999.99, 21, "�������", true);
        Item item2 = new Item("���������", "T1_d3_c1", 48999, 56, "������", true);
        Item item3 = new Item("�����������", "R99_d15_c4", 59999, 72, "�����", true);
        Item item4 = new Item("������� ���������", "S5_d12_c41", 54999, 8, "�����", true);
        Item item5 = new Item("�������", "A104_d83_c1", 109999, 0, "����", false);

        System.out.println("\u001B[31m" + "������� " + item1.vendorCode + " �������� - " + item1.name + " ���� - " + item1.price + " ���������� - " + item1.quantity + " ���� - " + item1.color + " ������� - " + (item1.isInStock ? "� �������" : "��� �����"));
        System.out.println("\u001B[30m" + "������� " + item2.vendorCode + " �������� - " + item2.name + " ���� - " + item2.price + " ���������� - " + item2.quantity + " ���� - " + item2.color + " ������� - " + (item2.isInStock ? "� �������" : "��� �����"));
        System.out.println("\u001B[37m" + "������� " + item3.vendorCode + " �������� - " + item3.name + " ���� - " + item3.price + " ���������� - " + item3.quantity + " ���� - " + item3.color + " ������� - " + (item3.isInStock ? "� �������" : "��� �����"));
        System.out.println("\u001B[34m" + "������� " + item4.vendorCode + " �������� - " + item4.name + " ���� - " + item4.price + " ���������� - " + item4.quantity + " ���� - " + item4.color + " ������� - " + (item4.isInStock ? "� �������" : "��� �����"));
        System.out.println("\u001B[36m" + "������� " + item5.vendorCode + " �������� - " + item5.name + " ���� - " + item5.price + " ���������� - " + item5.quantity + " ���� - " + item5.color + " ������� - " + (item5.isInStock ? "� �������" : "��� �����"));

    }
}
