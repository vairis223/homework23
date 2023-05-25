package io.codelex.classesandobjects.practice.exercise3;

public class Simulation {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer= new Odometer(fuelGauge);
        for (int i = 0; i < 70; i++) {
            fuelGauge.increaseFuel();
        }
        while (fuelGauge.getCurrentFuel() > 0) {
            odometer.increaseMileage();
            System.out.println("Mileage: " + odometer.getCurrentMileage() + " km");
            System.out.println("Fuel: " + fuelGauge.getCurrentFuel() + " liters");
            System.out.println();
        }
    }
}
