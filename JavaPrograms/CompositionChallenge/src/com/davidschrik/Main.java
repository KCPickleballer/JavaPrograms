package com.davidschrik;

public class Main {
    public static void main(String[] args) {
        Walls walls = new Walls(10, "green");
        Doors doors = new Doors(2, "wood");
        Windows windows = new Windows(2, 4, 3);
        Floor floor = new Floor("carpet", "brown" );
        Furnature furnature = new Furnature(3);

        Room room = new Room(floor, doors, windows, walls, furnature);

        room.addFurnature(false, true);


    }
}
