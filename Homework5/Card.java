package Homework5;

public class Card {

    private String number;
    private String expired;
    private int cvv;
    private int pinCode;

    public Card(String number, String expired, int cvv, int pinCode) {
        this.number = number;
        this.expired = expired;
        this.cvv = cvv;
        this.pinCode = pinCode;
    }

    public void maskCard (){
        System.out.println("**** **** **** " + number.substring(number.length()-4, number.length()));
    }

    public void pinCard (int pin){
        if(pin == this.pinCode){
            System.out.println(this.number);
        }else{
            System.out.println("неверный пин-код");
        }
    }


}
