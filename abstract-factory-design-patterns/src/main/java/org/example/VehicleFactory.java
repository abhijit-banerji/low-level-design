package org.example;

// Abstract Vehicle Factory
abstract class VehicleFactory {
    public abstract Vehicle createCar();
    public abstract Vehicle createMotorcycle();
    
    // Template method to demonstrate vehicle creation process
    public void demonstrateVehicle(String vehicleType) {
        Vehicle vehicle;
        switch(vehicleType.toLowerCase()) {
            case "car":
                vehicle = createCar();
                break;
            case "motorcycle":
                vehicle = createMotorcycle();
                break;
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
        }
        
        System.out.println("\n=== Demonstrating " + vehicle.getType() + " ===");
        vehicle.start();
        vehicle.drive();
        vehicle.stop();
        System.out.println("=== Demo Complete ===\n");
    }
}