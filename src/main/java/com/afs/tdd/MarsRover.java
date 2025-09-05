package com.afs.tdd;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }


    public void executeCommand(String command) {
        switch (command) {
            case "M":
                Move();
                break;
            case "L":
                turnLeft();
                break;
            case "R":
                turnRight();
                break;
        }
    }

    private void Move() {
        switch (direction) {
            case "N":
                y++;
                break;
            case "E":
                x++;
                break;
            case "S":
                y--;
                break;
            case "W":
                x--;
                break;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "E":
                direction = "N";
                break;
            case "S":
                direction = "E";
                break;
            case "W":
                direction = "S";
                break;
        }
    }

    private void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
        }
    }
}
