package org.example;

import org.example.vehicle.Vehicle;

public class ParkingService {
    private final ParkingLot parkingLot;

    public ParkingService(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (Floor floor : parkingLot.getFloors()) {
            if (floor.parkVehicle(vehicle)) {
                System.out.println("Vehicle parked at floor: " + floor.getFloorNumber());
                return true;
            }
        }
        System.out.println("No available spot for vehicle type: " + vehicle.getType());
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle) {
        for (Floor floor : parkingLot.getFloors()) {
            if (floor.unparkVehicle(vehicle)) {
                System.out.println("Vehicle unparked from floor: " + floor.getFloorNumber());
                return true;
            }
        }
        System.out.println("Vehicle not found in parking lot.");
        return false;
    }

    public void displayAvailableSpots() {
        for (Floor floor : parkingLot.getFloors()) {
            System.out.println("Floor " + floor.getFloorNumber() + " available spots: " + floor.getAvailableSpots());
        }
    }
}
