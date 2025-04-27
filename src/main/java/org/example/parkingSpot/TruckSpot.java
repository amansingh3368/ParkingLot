package org.example.parkingSpot;

import org.example.vehicle.Truck;
import org.example.vehicle.Vehicle;

public class TruckSpot extends ParkingSpot {
    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle instanceof Truck;
    }

    @Override
    public String getSpotType() {
        return "Truck";
    }
}
