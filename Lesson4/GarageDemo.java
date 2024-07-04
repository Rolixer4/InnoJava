package ru.inno.Lesson4;

public class GarageDemo {

    public static void main(String[] args) {

        Car[] garage = new Car[5];

        Car mySuperCar = new Car();
        mySuperCar.brand = "Kia";
        mySuperCar.color = "Black";
        mySuperCar.model = "Optima";
        mySuperCar.plateNumber = "A123GF";

        garage[0] = new Car();
        garage[0].brand = "Kia";
        garage[1] = mySuperCar;
        garage[2] = mySuperCar;
        garage[3] = mySuperCar;




    }
}
