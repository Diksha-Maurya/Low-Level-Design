package com.lld.elevator_system;

import com.lld.elevator_system.enums.Direction;
import com.lld.elevator_system.enums.ElevatorNumber;
import com.lld.elevator_system.enums.FloorNumber;
import com.lld.elevator_system.models.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ElevatorSystemApplication {

	public static void main(String[] args) {

		ElevatorSystem elevatorSystem=new ElevatorSystem();
		// Creating Elevators
		List<Elevator> elevators = new ArrayList<>();
		for(int i = 0;i<3;i++){
			elevators.add(new Elevator(ElevatorNumber.ELEVATOR_NUMBER1, new Door(), new InsidePannel(), new Display(), FloorNumber.FLOOR_NUMBER1, Direction.IDLE));
			elevators.add(new Elevator(ElevatorNumber.ELEVATOR_NUMBER2, new Door(), new InsidePannel(), new Display(), FloorNumber.FLOOR_NUMBER1, Direction.IDLE));
			elevators.add(new Elevator(ElevatorNumber.ELEVATOR_NUMBER3, new Door(), new InsidePannel(), new Display(), FloorNumber.FLOOR_NUMBER1, Direction.IDLE));
		}
		elevatorSystem.setElevatorList(elevators);

		//Creating Floors
		List<Floor> floors = new ArrayList<>();
		for(FloorNumber floor: FloorNumber.values()){
			floors.add(new Floor(floor, new OutsidePanel() ));
		}
		elevatorSystem.setFloor(floors);

		elevatorSystem.requestElevator(Direction.UP, floors.get(0));
		elevatorSystem.selectFloor(FloorNumber.FLOOR_NUMBER5, elevators.get(0));

		elevatorSystem.openDoor(elevators.get(0));
		elevatorSystem.closeDoor(elevators.get(0));

		SpringApplication.run(ElevatorSystemApplication.class, args);
	}

}
