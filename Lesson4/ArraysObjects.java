package ru.inno.Lesson4;

public class ArraysObjects {

    public static void main(String[] args) {

        Track[] playList = new Track[2];
        playList[0] = new Track(4, "Daft Punk", "Track", 2013, new byte[10]);
        playList[1] = new Track(307, "Юрий Лоза", "Плот", 1988, new byte[200]);

        System.out.println(playList[1].tracks);

        Track[] myList = {
        new Track(4, "Daft Punk", "Track", 2013, new byte[10]),
        new Track(307, "Юрий Лоза", "Плот", 1988, new byte[200]),
        new Track(307, "Юрий Лоза", "Плот", 1988, new byte[200]),
        new Track(307, "Юрий Лоза", "Плот", 1988, new byte[200]),
        new Track(307, "Юрий Лоза", "Плот", 1988, new byte[200])
        };

        System.out.println( myList[2].title );
    }
}
