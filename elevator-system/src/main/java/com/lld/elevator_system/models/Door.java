package com.lld.elevator_system.models;

import com.lld.elevator_system.enums.DoorAction;

public class Door {
    private DoorAction doorAction;

    public Door(){
        this.doorAction = DoorAction.CLOSE;
    }
    public void openDoor(){
        doorAction = DoorAction.OPEN;
    }
    public void closeDoor(){
        doorAction = DoorAction.CLOSE;
    }
}
