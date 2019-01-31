package com.davidschrik;

public class Doors {
    private int numDoors;
    private String doorType;

    public Doors(int numDoors, String doorType) {
        this.numDoors = numDoors;
        this.doorType = doorType;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public String getDoorType() {
        return doorType;
    }
}
