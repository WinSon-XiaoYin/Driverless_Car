package com.coding;

public class CarImpl implements Car {

    private int positionX;
    private int positionY;
    private String orientation;
    private CarPark carPark;

    public CarImpl(int positionX, int positionY, String orientation, CarPark carPark) {
        this.carPark = carPark;
        positionCheck(positionX, positionY);
        this.positionX = positionX;
        this.positionY = positionY;
        this.orientation = orientation;
    }

    private void positionCheck(int positionX, int positionY) {
        if (positionX <= 0 | positionX > this.carPark.getX()) {
            throw new PositionException(String.format("Car park: (%s, %s), postionX %s value error!!!", this.carPark.getX(), this.carPark.getY(), positionX));
        } else if (positionY <= 0 | positionY > this.carPark.getY()) {
            throw new PositionException(String.format("Car park: (%s, %s), postionY %s value error!!!", this.carPark.getX(), this.carPark.getY(), positionY));
        }
    }

    public void move(String command) {
        System.out.println("Command: " + command);
        if ("clockwise".equals(command)) {
          if (this.orientation.equals("N")) {
              this.orientation = "E";
          } else if (this.orientation.equals("E")) {
              this.orientation = "S";
          } else if (this.orientation.equals("S")) {
              this.orientation = "W";
          } else if (this.orientation.equals("W")) {
              this.orientation = "N";
          }
        } else if ("forward".equals(command)) {
            if (this.orientation.equals("N")) {
                this.positionY += 1;
            } else if (this.orientation.equals("W")) {
                this.positionX -= 1;
            } else if (this.orientation.equals("S")) {
                this.positionY -= 1;
            } else if (this.orientation.equals("E")) {
                this.positionX += 1;
            }
            positionCheck(positionX, positionY);
        } else {
            System.out.println("command error!!!");
        }
    }

    public int getPositionX() {
        return this.positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }

    public String getOrientation() {
        return this.orientation;
    }

    @Override
    public String toString() {
        return String.format("Car park: (%s, %s)" +
                " positionX=" + positionX +
                ", positionY=" + positionY +
                ", orientation='" + orientation + '\'',
                carPark.getX(), carPark.getY());
    }
}
