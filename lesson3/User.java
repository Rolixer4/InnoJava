package ru.inno.lesson3;

public class User {
    String name;
    int age;
    String phone;
    String email;
    double rating;
    boolean isOnline;

    public User(String myName){

        System.out.println("� ��������! ���� �����: " + name);
        name = myName;

    }
}
