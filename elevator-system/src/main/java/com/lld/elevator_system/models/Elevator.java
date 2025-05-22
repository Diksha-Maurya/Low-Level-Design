package com.lld.elevator_system.models;

import com.lld.elevator_system.enums.Direction;
import com.lld.elevator_system.enums.ElevatorNumber;
import com.lld.elevator_system.enums.FloorNumber;

public class Elevator {
    private ElevatorNumber elevatorNumber;
    private Door door;
    private InsidePannel insidePanel;
    private Display display;
    private FloorNumber floorNumber;
    private Direction direction;

    public Elevator(ElevatorNumber elevatorNumber, Door door, InsidePannel insidePanel, Display display, FloorNumber floorNumber, Direction direction) {
        this.elevatorNumber = elevatorNumber;
        this.door = door;
        this.insidePanel = insidePanel;
        this.display = display;
        this.floorNumber = floorNumber;
        this.direction = direction;
    }

    public ElevatorNumber getElevatorNumber() {
        return elevatorNumber;
    }

    public void setElevatorNumber(ElevatorNumber elevatorNumber) {
        this.elevatorNumber = elevatorNumber;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public InsidePannel getInsidePanel() {
        return insidePanel;
    }

    public void setInsidePanel(InsidePannel insidePanel) {
        this.insidePanel = insidePanel;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

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

    public void moveToFloor(FloorNumber targetFloor) {
        // Implement logic to move elevator to the target floor
        // Update currentFloorNumber and currentDirection accordingly
    }
}
