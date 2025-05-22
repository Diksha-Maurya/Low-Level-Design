package com.lld.elevator_system.models;

import com.lld.elevator_system.Interface.Button;
import com.lld.elevator_system.enums.FloorNumber;

public class ElevatorButton implements Button {
    private boolean status;
    private FloorNumber floorNumber;
    public ElevatorButton(boolean status, FloorNumber floorNumber){
        this.status = status;
        this.floorNumber = floorNumber;
    }
    public FloorNumber getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(FloorNumber floorNumber) {
        this.floorNumber = floorNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    @Override
    public boolean isPressed(){
        return status;
    }

    @Override
    public boolean press(){
        status = !status;
        return status;
    }
}
