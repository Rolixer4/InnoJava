package ru.inno.lesson3;

public class Playground {

    public static void main(String[] args) {

        int count = 1;
        int divider = 10;
        String city = "Москва";

        User user1 = new User("Alex");
        user1.age = 27;
        user1.phone = "88005553535";
        user1.email = "Gagaga@gmail.com";
        user1.isOnline = true;
        user1.rating = 21.5;

        User user2 = new User("Mike");
        user2.age = 33;

        System.out.println(user2.name + user2.age);
        System.out.println(user1.name + user1.age);
        user2.age = user2.age * 2;
        System.out.println(user2.age);

        Car car1 = new Car();
        car1.brand = "Kia";
        car1.color = "Black";
        car1.engineV = 2.5;
        car1.model = "Optima";
        car1.price = 1800;
        car1.year = 2018;


    }
}
