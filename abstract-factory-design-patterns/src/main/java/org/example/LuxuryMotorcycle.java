package org.example;

class LuxuryMotorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Luxury Motorcycle: Premium engine roar with heated grips");
    }
    
    @Override
    public void drive() {
        System.out.println("Luxury Motorcycle: High-performance ride with traction control");
    }
    
    @Override
    public void stop() {
        System.out.println("Luxury Motorcycle: Advanced braking system activated");
    }
    
    @Override
    public String getType() {
        return "Luxury Motorcycle";
    }
}