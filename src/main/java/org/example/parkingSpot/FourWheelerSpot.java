package org.example.parkingSpot;

import org.example.vehicle.Car;
import org.example.vehicle.Vehicle;

public class FourWheelerSpot extends ParkingSpot {
    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle instanceof Car;
    }

    @Override
    public String getSpotType() {
        return "FourWheeler";
    }
}
