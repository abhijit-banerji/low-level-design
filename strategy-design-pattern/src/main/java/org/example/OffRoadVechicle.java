package org.example;

import org.example.strategy.DriveStrategy;
import org.example.strategy.SportsDriveStrategy;

public class OffRoadVechicle extends Vehicle{

    public OffRoadVechicle() {
        super(new SportsDriveStrategy());
    }
}
