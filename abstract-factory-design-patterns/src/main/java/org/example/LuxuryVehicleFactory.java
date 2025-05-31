package org.example;

// Concrete Factory: Luxury Vehicle Factory
class LuxuryVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle createCar() {
        System.out.println("Manufacturing luxury car with premium materials...");
        return new LuxuryCar();
    }
    
    @Override
    public Vehicle createMotorcycle() {
        System.out.println("Crafting luxury motorcycle with high-end components...");
        return new LuxuryMotorcycle();
    }
}