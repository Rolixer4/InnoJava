package Homework5;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {


        String password = new Scanner(System.in).nextLine();

        if (password.length() < 8){
            System.out.println("Пароль должен быть не менее 8 символов");
        } else if (!password.matches("(.*\\d.*)")){
            System.out.println("Пароль должен содержать минимум 1 цифру");
        } else if (!password.matches("(.*[!@#$%^&*№].*)")) {
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
        }else{
            System.out.println("Пароль принят");
        }
    }
}
