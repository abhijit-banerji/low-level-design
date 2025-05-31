package org.example;

class OrdinaryMotorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Ordinary Motorcycle: Basic engine start");
    }
    
    @Override
    public void drive() {
        System.out.println("Ordinary Motorcycle: Efficient city riding");
    }
    
    @Override
    public void stop() {
        System.out.println("Ordinary Motorcycle: Standard braking");
    }
    
    @Override
    public String getType() {
        return "Ordinary Motorcycle";
    }
}
