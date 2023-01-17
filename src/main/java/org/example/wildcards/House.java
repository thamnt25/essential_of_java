package org.example.wildcards;

public class House extends Building {
    private int numberOfRooms;

    public House() {
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return "house";
    }
}
