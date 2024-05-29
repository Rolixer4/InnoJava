package ru.inno;

public class Homework1 {
    public static void main(String[] args) {
        String comment = "“естовый текст дл€ домашнего задани€";
        String comment2 = "@";
        String comment3 = null;
        String comment4 = "“естовый тест дл€ тестового задани€ теста тестовича";
        String comment5 = "    Ѕольшие пробелы, очень большие пробелы          ";

        //¬озвращает длину строки
        int result = comment.length();
        System.out.println(result);

        //¬озвращает True при отсутствии символов в строке
        boolean result2 = comment.isEmpty();
        System.out.println(result2);

        //¬озвращает True при отсутствии символов в строке, кроме blank-символов (пробел, табул€ци€ и т.д)
        boolean result3 = comment.isBlank();
        System.out.println(result3);

        //ќтображает символы с первого значени€ substring по последнее
        String result4 = comment.substring(3, 35);
        System.out.println(result4);

        //¬озвращает индекс первого вхождени€ указанной подстроки
        int result5 = comment.indexOf("текст");
        System.out.println(result5);

        //¬озвращает индекс последнего вхождени€ указанной подстроки
        int result6 = comment4.lastIndexOf("тест");
        System.out.println(result6);

        //¬озвращает строку в нижнем регистре
        String result7 = comment.toLowerCase();
        System.out.println(result7);

        //¬озвращает строку в верхнем регистре
        String result8 = comment.toUpperCase();
        System.out.println(result8);

        //¬озвращает строку с измененным значением 1 на значение 2
        String result9 = comment4.replace("тест", "шмест");
        System.out.println(result9);

        //¬озвращает true, если строка начинаетс€ с заданного значени€
        Boolean result10 = comment.startsWith("Ўмест");
        System.out.println(result10);

        //¬озвращает true, если строка заканчиваетс€ заданным значением
        Boolean result11 = comment4.endsWith("тестовича");
        System.out.println(result11);

        //¬озвращает строку в заданном количестве
        String result12 = comment.repeat(4);
        System.out.println(result12);

        //¬озвращает true если строка содержит заданное значение
        Boolean result13 = comment2.contains("");
        System.out.println(result13);

        //¬озвращает строку с добавленным в конце переданным значением
        String result14 = comment.concat("“ест");
        System.out.println(result14);

        //¬озвращает строку с убранными пробелами в начале и конце
        String result15 = comment5.trim();
        System.out.println(result15);

        //
        Boolean result16 = comment2.equals("@");
        System.out.println(result16);

    }
}
