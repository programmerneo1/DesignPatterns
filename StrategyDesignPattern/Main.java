package StrategyDesignPattern;

public class Main {
    public static void main(String args[]) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
        Vehicle vehicle1 = new SportsVehicle();
        vehicle1.drive();
    }
}
