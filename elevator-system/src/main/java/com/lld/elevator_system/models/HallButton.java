package com.lld.elevator_system.models;

import com.lld.elevator_system.Interface.Button;
import com.lld.elevator_system.enums.Direction;

public class HallButton implements Button {

    private boolean status;
    private Direction direction;

    public HallButton(boolean status, Direction direction){
        this.status = status;
        this.direction = direction;
    }

    @Override
    public boolean isPressed(){
        return status;
    }


    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setStatus(boolean status){
        this.status = status;
    }


    @Override
    public boolean press(){
        status = !status;
        return status;
    }

    public Direction getDirection() {
        return direction;
    }
}
