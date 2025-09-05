package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_y_plus_when_input_command_M_direction_N() {
        String command = "M";

        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getY());
    }

    @Test
    public void should_return_x_plus_when_input_command_M_Direction_E() {
        String command = "M";

        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getX());
    }

    @Test
    public void should_return_y_plus_when_input_command_M_Direction_S() {
        String command = "M";

        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.executeCommand(command);

        assertEquals(-1, marsRover.getY());
    }

    @Test
    public void should_return_x_plus_when_input_command_M_Direction_W() {
        String command = "M";

        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.executeCommand(command);

        assertEquals(-1, marsRover.getX());
    }

    @Test
    public void should_return_direction_plus_when_input_command_L_Direction_N() {
        String command = "L";

        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.executeCommand(command);

        assertEquals("W", marsRover.getDirection());
    }


}
