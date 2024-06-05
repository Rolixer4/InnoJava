package ru.inno.Homework4;

public class Task1 {

    public static void main(String[] args) {


        String[] toDoList = new String[5];
        toDoList[0] = "Пресс качат";
        toDoList[1] = "Бегит";
        toDoList[2] = "Турник";
        toDoList[3] = "Анжуманя";
        toDoList[4] = "Репит";

        for(int i = 0; i < toDoList.length; i++){

            System.out.println(toDoList[i]);
        }
    }
}
