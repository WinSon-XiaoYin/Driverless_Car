package com.coding;

public class CarPark {
    private int x;
    private int y;

    public CarPark(int x, int y) {
        check(x, y);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private void check(int x, int y) {
        if (x <= 0) {
            throw new PositionException("Car park x value error!!!");
        } else if (y <= 0) {
            throw new PositionException("Car park Y value error!!!");
        }
    }
}
