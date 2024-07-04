package ru.inno.Homework2;

public class Room {

    double roomWidth;
    double roomLength;
    double roomHeight;
    String roomName;
    Boolean isHasFurniture;

    public Room(double setRoomWidth, double setRoomLength, double setRoomHeight, String setRoomName, Boolean setIsHasFurniture) {

        roomWidth = setRoomWidth;
        roomLength = setRoomLength;
        roomHeight = setRoomHeight;
        roomName = setRoomName;
        isHasFurniture = setIsHasFurniture;

    }

}
