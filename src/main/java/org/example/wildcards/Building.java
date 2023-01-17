package org.example.wildcards;

public class Building {
    private int numberOfRooms;

    public Building() {
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return "building";
    }
}
