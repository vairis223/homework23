package io.codelex.classesandobjects.practice.exercise3;

public class FuelGauge {
    double currentFuel = 0;

    public double getCurrentFuel() {
        return currentFuel;
    }

    public void increaseFuel() {
        if (currentFuel < 70) {
            currentFuel++;
        }
    }

    public void decreaseFuel() {
        if (currentFuel > 0) {
            currentFuel--;

        }
    }
}
