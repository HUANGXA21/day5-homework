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
        if(direction.equals("N")) {
            y++;
        }
        if(direction.equals("E")) {
            x++;
        }
        if(direction.equals("S")) {
            y--;
        }
        if(direction.equals("W")) {
            x--;
        }

    }
}
