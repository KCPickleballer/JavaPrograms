package com.davidschrik;

public class Windows {
    private int numWindows;
    private int windowHeight;
    private int windowWidth;

    public Windows(int numWindows, int windowHeight, int windowWidth) {
        this.numWindows = numWindows;
        this.windowHeight = windowHeight;
        this.windowWidth = windowWidth;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public int getWindowWidth() {
        return windowWidth;
    }
}
