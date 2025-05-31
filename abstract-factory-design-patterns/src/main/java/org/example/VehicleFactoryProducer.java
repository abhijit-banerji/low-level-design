package org.example;

// Factory of Factories (Abstract Factory Producer)
class VehicleFactoryProducer {
    public static VehicleFactory getFactory(String factoryType) {
        switch (factoryType.toLowerCase()) {
            case "luxury":
                System.out.println("Creating Luxury Vehicle Factory...");
                return new LuxuryVehicleFactory();
            case "ordinary":
                System.out.println("Creating Ordinary Vehicle Factory...");
                return new OrdinaryVehicleFactory();
            default:
                throw new IllegalArgumentException("Unknown factory type: " + factoryType);
        }
    }

    public static void listAvailableFactories() {
        System.out.println("Available Factory Types:");
        System.out.println("- luxury: Creates luxury vehicles");
        System.out.println("- ordinary: Creates ordinary vehicles");
    }
}