package org.example;

import org.example.strategy.DriveStrategy;
import org.example.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
