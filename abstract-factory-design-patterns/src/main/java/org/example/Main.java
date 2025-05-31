package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Abstract Factory Pattern Demo ===");
        System.out.println("Vehicle Manufacturing System\n");

        // List available factories
        VehicleFactoryProducer.listAvailableFactories();
        System.out.println();

        try {
            // Create luxury vehicle factory
            VehicleFactory luxuryFactory = VehicleFactoryProducer.getFactory("luxury");

            // Demonstrate luxury vehicles
            luxuryFactory.demonstrateVehicle("car");
            luxuryFactory.demonstrateVehicle("motorcycle");

            // Create ordinary vehicle factory
            VehicleFactory ordinaryFactory = VehicleFactoryProducer.getFactory("ordinary");

            // Demonstrate ordinary vehicles
            ordinaryFactory.demonstrateVehicle("car");
            ordinaryFactory.demonstrateVehicle("motorcycle");

            // Show individual vehicle creation
            System.out.println("=== Individual Vehicle Creation ===");
            Vehicle luxuryCar = luxuryFactory.createCar();
            System.out.println("Created: " + luxuryCar.getType());

            Vehicle ordinaryMotorcycle = ordinaryFactory.createMotorcycle();
            System.out.println("Created: " + ordinaryMotorcycle.getType());

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== Demo Complete ===");
    }
}