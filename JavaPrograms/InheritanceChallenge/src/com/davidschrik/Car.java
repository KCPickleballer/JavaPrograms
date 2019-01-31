package com.davidschrik;

public class Car extends Vehicle {
    private String steering;

    public Car(int gear, int speed, String steering) {
        super(gear, speed);
        this.steering = steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public String getSteering() {
        return steering;
    }
}

