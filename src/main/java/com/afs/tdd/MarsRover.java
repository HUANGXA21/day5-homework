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
                break;
            case "L":
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
                break;
            case "R":
                switch (direction) {
                    case "N":
                        direction = "E";
                        break;

                }
        }


    }
}
