package io.codelex.classesandobjects.practice.car;



import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startOdo;
        double endOdo;
        double liters;

        System.out.print("Enter first reading: ");
        startOdo = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endOdo = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car1 = new Car(startOdo, endOdo, liters);

        System.out.println("Fuel consumption for car 1: " + car1.calculateConsumption() + " liters per 100 kilometers");
        System.out.println("Is car 1 a gas hog? " + car1.gasHog());
        System.out.println("Is car 1 economical? " + car1.economyCar());

        System.out.print("Enter first reading for car 2: ");
        startOdo = scan.nextDouble();

        System.out.print("Enter second reading for car 2: ");
        endOdo = scan.nextDouble();

        System.out.print("Enter liters consumed for car 2: ");
        liters = scan.nextDouble();

        Car car2 = new Car(startOdo, endOdo, liters);

        System.out.println("Fuel consumption for car 2: " + car2.calculateConsumption() + " liters per 100 kilometers");
        System.out.println("Is car 2 a gas hog ? " + car2.gasHog());
        System.out.println("Is car 2 economical? " + car2.economyCar());

    }
}