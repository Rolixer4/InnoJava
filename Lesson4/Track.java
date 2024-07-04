package ru.inno.Lesson4;

public class Track {

    int duration;
    String author;
    String title;
    int year;
    byte[] tracks;

    public Track(int duration, String author, String title, int year, byte[] tracks) {

        this.duration = duration;
        this.author = author;
        this.title = title;
        this.year = year;
        this.tracks = tracks;

    }
}
