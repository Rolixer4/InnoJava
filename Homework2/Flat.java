package ru.inno.Homework2;

public class Flat {

    int numberOfRooms;
    int floor;
    Boolean isForSale;
    Room room;
    double price;

    public Flat(int setNumberOfRooms, int setFloor, Boolean setIsForSale, double setPrice){

        numberOfRooms = setNumberOfRooms;
        floor = setFloor;
        isForSale = setIsForSale;
        price = setPrice;

    }

}
