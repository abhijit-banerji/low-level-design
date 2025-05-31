package org.example;

// Luxury Vehicle implementations
class LuxuryCar implements Vehicle {

    @Override
    public void start() {
        System.out.println("Luxury Car: Silent engine startup with premium sound system");
    }

    @Override
    public void drive() {
        System.out.println("Luxury Car: Smooth ride with adaptive suspension");
    }

    @Override
    public void stop() {
        System.out.println("Luxury Car: Auto-parking engaged");
    }

    @Override
    public String getType() {
        return "Luxury Car";
    }
}

