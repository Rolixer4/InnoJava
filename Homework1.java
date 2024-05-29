package ru.inno;

public class Homework1 {
    public static void main(String[] args) {
        String comment = "Тестовый текст для домашнего задания";
        String comment2 = "@";
        String comment3 = null;
        String comment4 = "Тестовый тест для тестового задания теста тестовича";
        String comment5 = "    Большие пробелы, очень большие пробелы          ";

        //Возвращает длину строки
        int result = comment.length();
        System.out.println(result);

        //Возвращает True при отсутствии символов в строке
        boolean result2 = comment.isEmpty();
        System.out.println(result2);

        //Возвращает True при отсутствии символов в строке, кроме blank-символов (пробел, табуляция и т.д)
        boolean result3 = comment.isBlank();
        System.out.println(result3);

        //Отображает символы с первого значения substring по последнее
        String result4 = comment.substring(3, 35);
        System.out.println(result4);

        //Возвращает индекс первого вхождения указанной подстроки
        int result5 = comment.indexOf("текст");
        System.out.println(result5);

        //Возвращает индекс последнего вхождения указанной подстроки
        int result6 = comment4.lastIndexOf("тест");
        System.out.println(result6);

        //Возвращает строку в нижнем регистре
        String result7 = comment.toLowerCase();
        System.out.println(result7);

        //Возвращает строку в верхнем регистре
        String result8 = comment.toUpperCase();
        System.out.println(result8);

        //Возвращает строку с измененным значением 1 на значение 2
        String result9 = comment4.replace("тест", "шмест");
        System.out.println(result9);

        //Возвращает true, если строка начинается с заданного значения
        Boolean result10 = comment.startsWith("Шмест");
        System.out.println(result10);

        //Возвращает true, если строка заканчивается заданным значением
        Boolean result11 = comment4.endsWith("тестовича");
        System.out.println(result11);

        //Возвращает строку в заданном количестве
        String result12 = comment.repeat(4);
        System.out.println(result12);

        //Возвращает true если строка содержит заданное значение
        Boolean result13 = comment2.contains("");
        System.out.println(result13);

        //Возвращает строку с добавленным в конце переданным значением
        String result14 = comment.concat("Тест");
        System.out.println(result14);

        //Возвращает строку с убранными пробелами в начале и конце
        String result15 = comment5.trim();
        System.out.println(result15);

        //
        Boolean result16 = comment2.equals("@");
        System.out.println(result16);

    }
}
