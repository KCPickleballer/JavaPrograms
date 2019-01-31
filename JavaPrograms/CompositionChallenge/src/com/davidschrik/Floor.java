package com.davidschrik;

public class Floor {
    private String floorType;
    private String color;

    public Floor(String floorType, String color) {
        this.floorType = floorType;
        this.color = color;
    }

    public String getFloorType() {
        return floorType;
    }

    public String getColor() {
        return color;
    }
}
