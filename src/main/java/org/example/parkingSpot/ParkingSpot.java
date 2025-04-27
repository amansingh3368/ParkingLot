package org.example.parkingSpot;

import org.example.vehicle.Vehicle;

public abstract class ParkingSpot {
    protected boolean occupied;
    protected Vehicle vehicle;

    public boolean isAvailable() {
        return !occupied;
    }

    public abstract boolean canFitVehicle(Vehicle vehicle);

    public synchronized boolean park(Vehicle vehicle) {
        if (!canFitVehicle(vehicle) || occupied) {
            return false;
        }
        this.vehicle = vehicle;
        this.occupied = true;
        return true;
    }

    public synchronized boolean unpark() {
        if (!occupied) {
            return false;
        }
        this.vehicle = null;
        this.occupied = false;
        return true;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public abstract String getSpotType();
}
