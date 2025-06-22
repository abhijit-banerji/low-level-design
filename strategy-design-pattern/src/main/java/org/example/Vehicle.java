package org.example;

import org.example.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    //Constructor Injection
    public Vehicle(DriveStrategy strategy) {
        this.driveStrategy = strategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
