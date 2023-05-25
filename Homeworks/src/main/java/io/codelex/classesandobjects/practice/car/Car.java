package io.codelex.classesandobjects.practice.car;

public class Car {
    private double startOdo;
    private double endOdo;
    private double liters;

    public Car(double startOdo, double endOdo, double liters) {
        this.startOdo = startOdo;
        this.endOdo = endOdo;
        this.liters = liters;
    }

    public double calculateConsumption() {
        double kilometersTraveled = endOdo - startOdo;
        return liters / (kilometersTraveled / 100.0);
    }

    public boolean gasHog() {
        double consumption = calculateConsumption();
        if (consumption > 15.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean economyCar() {
        double consumption = calculateConsumption();
        if (consumption < 5.0) {
            return true;
        } else {
            return false;
        }
    }

    public void fillUp(int mileage, double liters) {
        startOdo = endOdo;
        endOdo = mileage;
        this.liters += liters;
    }
}
