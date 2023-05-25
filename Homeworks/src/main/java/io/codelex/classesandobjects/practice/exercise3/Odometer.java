package io.codelex.classesandobjects.practice.exercise3;

public class Odometer {
    int currentMileage;
    FuelGauge fuelGauge;

    public Odometer(FuelGauge fuelGauge) {
        this.currentMileage = 0;
        this.fuelGauge = fuelGauge;
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public void increaseMileage() {
        if (currentMileage < 999999) {
            currentMileage++;
        } else {
            currentMileage = 0;
        }
        if (currentMileage % 10 == 0) {
            fuelGauge.decreaseFuel();
        }
    }
}




