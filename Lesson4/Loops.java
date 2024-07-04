package ru.inno.Lesson4;

public class Loops {

    public static void main(String[] args) {

        Student[] group = new Student[7];

        group[0] = new Student("Алена", "Швайка");
        group[1] = new Student("Анна", "");
        group[2] = new Student("Вадим", "");
        group[3] = new Student("Галина", "Смирнова");
        group[4] = new Student("Данила", "Аникин");
        group[5] = new Student("Камиль", "Немов");
        group[6] = new Student("Милана", "");

        group[1].isPresent = true;
        group[2].isPresent = true;
        group[3].isPresent = false;
        group[4].isPresent = false;

        String info;


        for (int i = 0; i<group.length; i=i+1 ){
            System.out.println(group[i].firstName + " " + group[i].lastName + " " + group[i].isPresent);
        }

        for (Student student : group){
            System.out.println(student.firstName + " " + student.lastName + " " + student.isPresent);
        }

//        i = 0;
//
//        info = group[i].firstName + " " + group[i].lastName + " " + group[i].isPresent;
//        System.out.println(info);
//
//        i = 1;
//
//        info = group[i].firstName + " " + group[i].lastName + " " + group[i].isPresent;
//        System.out.println(info);
//
//        i = 2;
//
//        info = group[i].firstName + " " + group[i].lastName + " " + group[i].isPresent;
//        System.out.println(info);
//
//        i = 3;
//
//        info = group[i].firstName + " " + group[i].lastName + " " + group[i].isPresent;
//        System.out.println(info);
//
//        i = 4;
//
//        info = group[i].firstName + " " + group[i].lastName + " " + group[i].isPresent;
//        System.out.println(info);

    }
}
