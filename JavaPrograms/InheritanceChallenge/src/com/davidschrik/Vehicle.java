package com.davidschrik;

public class Vehicle {
    private int gear;
    private int speed;


    public Vehicle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;

    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
