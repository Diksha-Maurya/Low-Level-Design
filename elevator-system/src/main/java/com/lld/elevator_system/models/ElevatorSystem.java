package com.lld.elevator_system.models;

import com.lld.elevator_system.enums.Direction;
import com.lld.elevator_system.enums.FloorNumber;

import java.util.List;

public class ElevatorSystem {
    private List<Elevator> elevatorList;
    private List<Floor> floor;
    public static volatile ElevatorSystem elevatorSystemInstance;


    //This makes sure that there is only one instance of the ElevatorSystem in the entire app.
    public static ElevatorSystem getInstance(){
        if(ElevatorSystem.elevatorSystemInstance == null) {
            synchronized (ElevatorSystem.class) {
                elevatorSystemInstance = new ElevatorSystem();
            }
        }
        return elevatorSystemInstance;
    }
    public Elevator requestElevator(Direction direction, Floor floor){
        return null;
    }

    public void openDoor(Elevator elevator){
        elevator.getDoor().openDoor();
    }

    public void closeDoor(Elevator elevator){
        elevator.getDoor().closeDoor();
    }

    public List<Elevator> getElevator(){
        return this.elevatorList;
    }

    public void setElevatorList(List<Elevator> elevatorList) {
        this.elevatorList = elevatorList;
    }

    public List<Floor> getFloor() {
        return floor;
    }

    public void setFloor(List<Floor> floor) {
        this.floor = floor;
    }

    public void selectFloor(FloorNumber floorNumber, Elevator elevator){
        elevator.getInsidePanel().pressFloorButton(floorNumber.ordinal());
    }
}
