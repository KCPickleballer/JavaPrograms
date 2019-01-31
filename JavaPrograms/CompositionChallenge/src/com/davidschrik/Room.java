package com.davidschrik;

public class Room {
    private Floor floor;
    private Doors doors;
    private Windows windows;
    private Walls walls;
    private Furnature furnature;

    public Room(Floor floor, Doors doors, Windows windows, Walls walls, Furnature furnature) {
        this.floor = floor;
        this.doors = doors;
        this.windows = windows;
        this.walls = walls;
        this.furnature = furnature;
    }

    public void addFurnature(boolean addTv, boolean addCouch){
        if (addTv)
            furnature.addTv();
        if (addCouch)
            furnature.addCouch();

    }
}
