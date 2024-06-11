package Homework5;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {


        int number = new Scanner(System.in).nextInt();


        if (number % 2 == 0){
            System.out.println("Четное число");
        }else{
            System.out.println("Нечетное число");
        }
    }
}
