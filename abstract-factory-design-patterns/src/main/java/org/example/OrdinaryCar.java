package org.example;

// Ordinary Vehicle implementations
class OrdinaryCar implements Vehicle {
    @Override
    public void start() {
        System.out.println("Ordinary Car: Standard engine startup");
    }
    
    @Override
    public void drive() {
        System.out.println("Ordinary Car: Reliable daily commute");
    }
    
    @Override
    public void stop() {
        System.out.println("Ordinary Car: Manual parking");
    }
    
    @Override
    public String getType() {
        return "Ordinary Car";
    }
}