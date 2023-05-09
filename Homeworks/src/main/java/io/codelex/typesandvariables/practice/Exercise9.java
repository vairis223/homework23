package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter distance in meters: ");
        float meters = scanner.nextFloat();
        System.out.println("Enter time taken in hours, minutes, and seconds: ");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();


        float timeInSeconds = hours * 3600 + minutes * 60 + seconds;
        float speedInMetersPerSecond = meters / timeInSeconds;
        float speedInKiloPerHour = (meters / 1000) / (timeInSeconds / 3600);
        float speedInMilesPerHour = (meters / 1609) / (timeInSeconds / 3600);

        System.out.println("Your speed in meters/second: " + speedInMetersPerSecond);
        System.out.println("Your speed in km/h: " + speedInKiloPerHour);
        System.out.printf("Your speed in miles/h: %.8f ", speedInMilesPerHour);


    }
}
