package Homework5;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {


        int number = new Scanner(System.in).nextInt();


        if (number % 4 == 0){
            System.out.println("Четное число кратное 4");
        }else if(number % 2 == 0){
            System.out.println("Четное число не кратное 4");
        }
        else if(number % 3 == 0){
            System.out.println("Нечетное число кратное 3");
        }
        else{
            System.out.println("Нечетное число не кратное 3");
        }
    }
}
