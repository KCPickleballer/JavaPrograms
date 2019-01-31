package com.davidschrik;

public class Walls {
    private int wallHeight;
    private String wallColor;

    public Walls(int wallHeight, String wallColor) {
        this.wallHeight = wallHeight;
        this.wallColor = wallColor;
    }

    public int getWallHeight() {
        return wallHeight;
    }

    public String getWallColor() {
        return wallColor;
    }
}
