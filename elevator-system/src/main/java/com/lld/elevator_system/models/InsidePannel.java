package com.lld.elevator_system.models;

import com.lld.elevator_system.enums.DoorAction;
import com.lld.elevator_system.enums.FloorNumber;

import java.util.ArrayList;
import java.util.List;

public class InsidePannel implements Pannel{
    private List<ElevatorButton> elevatorButtonList;
    private List<DoorButton> doorButtons;

    public InsidePannel(){
        elevatorButtonList= new ArrayList<>();
        doorButtons = new ArrayList<>();
        for (FloorNumber floor : FloorNumber.values()) {
            elevatorButtonList.add(new ElevatorButton(false, floor));
        }

        for (DoorAction action : DoorAction.values()) {
            doorButtons.add(new DoorButton(false, action));
        }
    }

    public boolean pressFloorButton(int floorNumber){
        return this.elevatorButtonList.get(floorNumber).press();
    }
}
