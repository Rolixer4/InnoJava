package Homework5;

public class Task6 {

    public static void main(String[] args) {

        Card card1 = new Card("1234 5678 9012 3456", "03/21", 322, 3333);

        card1.maskCard();
        card1.pinCard(3333);

    }
}
