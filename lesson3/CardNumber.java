package ru.inno.lesson3;

public class CardNumber {
    public static void main(String[] args) {
        String cardNumber = "1234 5678 9123 4567";
        String cardNumber2 = "1234567891234567";
        String field4 = cardNumber.substring(cardNumber.length()-4, cardNumber.length());
        String crutch = cardNumber.substring(0, cardNumber.length()-4).trim();
        String field3 = crutch.substring(crutch.length()-4, crutch.length()).replaceAll("\\d", "*").concat(" ");
        String field2 = cardNumber.substring(4, cardNumber.length()).trim().substring(0,4).replaceAll("\\d", "*").concat(" ");
        String field1 = cardNumber.substring(0,4).replaceAll("\\d", "*").concat(" ");
        String result = field1 + field2 + field3 + field4;

        System.out.println(field4);
        System.out.println(field3);
        System.out.println(field2);
        System.out.println(field1);
        System.out.println(result);

        String field8 = cardNumber2.substring(cardNumber2.length()-4, cardNumber2.length());
        String crutch2 = cardNumber2.substring(0, cardNumber2.length()-4).trim();
        String field7 = crutch2.substring(crutch2.length()-4, crutch2.length()).replaceAll("\\d", "*").concat(" ");
        String field6 = cardNumber2.substring(4, cardNumber2.length()).trim().substring(0,4).replaceAll("\\d", "*").concat(" ");
        String field5 = cardNumber2.substring(0,4).replaceAll("\\d", "*").concat(" ");
        String result2 = field5 + field6 + field7 + field8;

        System.out.println(field8);
        System.out.println(field7);
        System.out.println(field6);
        System.out.println(field5);
        System.out.println(result2);
        String testCard = "1244 5439 8567 0129";
        String maskedCard = maskCardNumber(testCard);
        System.out.println(maskedCard);
    }
    public static String maskCardNumber(String cardNumber) {
        String pole4 = cardNumber.substring(cardNumber.length()-4, cardNumber.length());
        String crutch = cardNumber.substring(0, cardNumber.length()-4).trim();
        String pole3 = crutch.substring(crutch.length()-4, crutch.length()).replaceAll("\\d", "*").concat(" ");
        String pole2 = cardNumber.substring(4, cardNumber.length()).trim().substring(0,4).replaceAll("\\d", "*").concat(" ");
        String pole1 = cardNumber.substring(0,4).replaceAll("\\d", "*").concat(" ");
        return (pole1 + pole2 + pole3 + pole4);
    }
}
