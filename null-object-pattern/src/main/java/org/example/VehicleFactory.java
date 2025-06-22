package org.example;

public class VehicleFactory {
    static Vehicle getVehicle(String typeOfVehicle) {
        if("Car".equalsIgnoreCase(typeOfVehicle)) {
            return new Car();
        }
        return new NullVehicle();
    }
}
