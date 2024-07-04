package ru.inno.lesson3;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Галина";
        String upperCaseName = name.toUpperCase();
        String lowerCasename = name.toLowerCase();
        boolean blank = "".isBlank();

        System.out.println("name = " + name);
        System.out.println("upperCaseName = " + upperCaseName);
        System.out.println("lowerCaseName = " + lowerCasename);
        System.out.println("blank = " + blank);
        
        boolean startwWitchGa = name.startsWith("");
        System.out.println("startwWitchGa = " + startwWitchGa);


    }
}
