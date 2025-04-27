package org.example;

import org.example.vehicle.Bike;
import org.example.vehicle.Car;
import org.example.vehicle.Truck;

public class Main {
    public static void main(String[] args){
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.addFloor(new Floor(0, 5, 5, 2));
        parkingLot.addFloor(new Floor(1, 3, 6, 1));

        ParkingService service = new ParkingService(parkingLot);

        Bike bike1 = new Bike();
        Car car1 = new Car();
        Truck truck1 = new Truck();

        service.displayAvailableSpots();

        service.parkVehicle(bike1);
        service.parkVehicle(car1);
        service.parkVehicle(truck1);

        service.displayAvailableSpots();

        service.unparkVehicle(car1);

        service.displayAvailableSpots();
    }
}