package com.davidschrik;

public class Beetle extends Car {
    private String color;
    private int size;

    public Beetle(int gear, int speed, String steering, String color, int size) {
        super(gear, speed, steering);
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
