package com.davidschrik;

public class Main {
    public static void main(String[] args) {
        Beetle beetle = new Beetle(1,0, "Straight", "Blue", 1200);
        beetle.setSpeed(100);
        System.out.println("beetle going " + beetle.getSpeed());
    }
}
