package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy obj) {
        this.driveStrategy = obj;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
