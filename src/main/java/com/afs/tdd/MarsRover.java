package com.afs.tdd;

import java.util.stream.IntStream;

public class MarsRover {

    public static final String MOVE_FORWARD = "M";
    public static final String LEFT = "L";
    public static final String RIGHT = "R";

    public static final String NORTH = "N";
    public static final String EAST = "E";
    public static final String SOUTHERN = "S";
    public static final String WEST = "W";
    public static final String MOVE_BACKWARD = "B";
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
            case MOVE_FORWARD:
                moveForward();
                break;
            case MOVE_BACKWARD:
                moveBackward();
                break;
            case LEFT:
                turnLeft();
                break;
            case RIGHT:
                turnRight();
                break;
        }
    }

    public void executeCommands(String commands) {
        String[] commandList = convertCommands(commands);
        for (String command : commandList) {
            executeCommand(command);
        }
    }

    private String[] convertCommands(String commands) {
        if (commands == null) {
            return new String[0];
        }
        return IntStream.range(0, commands.length())
                .mapToObj(i -> String.valueOf(commands.charAt(i)))
                .toArray(String[]::new);
    }


    private void moveBackward() {
        switch (direction) {
            case NORTH:
                y--;
                break;
            case EAST:
                x--;
                break;
            case SOUTHERN:
                y++;
                break;
            case WEST:
                x++;
                break;
        }
    }

    private void moveForward() {
        switch (direction) {
            case NORTH:
                y++;
                break;
            case EAST:
                x++;
                break;
            case SOUTHERN:
                y--;
                break;
            case WEST:
                x--;
                break;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case NORTH:
                direction = WEST;
                break;
            case EAST:
                direction = NORTH;
                break;
            case SOUTHERN:
                direction = EAST;
                break;
            case WEST:
                direction = SOUTHERN;
                break;
        }
    }

    private void turnRight() {
        switch (direction) {
            case NORTH:
                direction = EAST;
                break;
            case EAST:
                direction = SOUTHERN;
                break;
            case SOUTHERN:
                direction = WEST;
                break;
            case WEST:
                direction = NORTH;
                break;
        }
    }
}
