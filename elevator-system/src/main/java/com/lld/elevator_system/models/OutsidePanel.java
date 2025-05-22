package com.lld.elevator_system.models;

import com.lld.elevator_system.enums.Direction;

import java.util.ArrayList;
import java.util.List;

public class OutsidePanel implements Pannel {
    private List<HallButton> hallButtons;

    public OutsidePanel() {
        hallButtons = new ArrayList<>();
        hallButtons.add(new HallButton(false, Direction.UP));
        hallButtons.add(new HallButton(false, Direction.DOWN));

    }
}