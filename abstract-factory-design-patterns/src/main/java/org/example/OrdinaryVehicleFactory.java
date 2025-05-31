package org.example;

class OrdinaryVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle createCar() {
        System.out.println("Assembling ordinary car with standard parts...");
        return new OrdinaryCar();
    }
    
    @Override
    public Vehicle createMotorcycle() {
        System.out.println("Building ordinary motorcycle with reliable components...");
        return new OrdinaryMotorcycle();
    }
}