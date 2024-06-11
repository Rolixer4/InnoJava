package Homework5;

public class Task7 {

    public static void main(String[] args) {

        Car car1 = new Car("Optima", "KIA", 0);

        int speed = car1.getCurrentSpeed();
        System.out.println(speed);

        car1.speedUp(25);
        System.out.println(car1.getCurrentSpeed());

        car1.Break();
        System.out.println(car1.getCurrentSpeed());

        car1.Break();
        System.out.println(car1.getCurrentSpeed());

        car1.Break();
        System.out.println(car1.getCurrentSpeed());


    }
}
