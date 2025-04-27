package org.example;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final List<Floor> floors;

    public ParkingLot() {
        this.floors = new ArrayList<>();
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public List<Floor> getFloors() {
        return floors;
    }
}
