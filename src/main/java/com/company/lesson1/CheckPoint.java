package com.company.lesson1;

public class CheckPoint {
    private int x;
    private int y;
    private boolean hasGasStation;

    public CheckPoint(int x, int y, boolean hasGasStation) {
        this.x = x;
        this.y = y;
        this.hasGasStation = hasGasStation;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean hasGasStation() {
        return hasGasStation;
    }
}
