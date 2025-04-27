package org.example.parkingSpot;

import org.example.vehicle.Bike;
import org.example.vehicle.Vehicle;

public class TwoWheelerSpot extends ParkingSpot {
    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle instanceof Bike;
    }

    @Override
    public String getSpotType() {
        return "TwoWheeler";
    }
}
