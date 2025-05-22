package com.lld.elevator_system.models;

import com.lld.elevator_system.enums.Direction;
import com.lld.elevator_system.enums.FloorNumber;

public class Display {

    private FloorNumber floorNumber;
    private Direction direction;

    public FloorNumber getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(FloorNumber floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
