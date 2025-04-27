package org.example;

import org.example.parkingSpot.*;
import org.example.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private final List<ParkingSpot> spots;
    private final int floorNumber;

    public Floor(int floorNumber, int twoWheelerCount, int fourWheelerCount, int truckCount) {
        this.floorNumber = floorNumber;
        this.spots = new ArrayList<>();

        for (int i = 0; i < twoWheelerCount; i++) {
            spots.add(new TwoWheelerSpot());
        }
        for (int i = 0; i < fourWheelerCount; i++) {
            spots.add(new FourWheelerSpot());
        }
        for (int i = 0; i < truckCount; i++) {
            spots.add(new TruckSpot());
        }
    }

    public synchronized boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.isAvailable() && spot.canFitVehicle(vehicle)) {
                return spot.park(vehicle);
            }
        }
        return false;
    }

    public synchronized boolean unparkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (!spot.isAvailable() && spot.getVehicle().equals(vehicle)) {
                return spot.unpark();
            }
        }
        return false;
    }

    public int getAvailableSpots() {
        int count = 0;
        for (ParkingSpot spot : spots) {
            if (spot.isAvailable()) {
                count++;
            }
        }
        return count;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
