package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";
    private static Map<String, List<String>> flightMap;

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Objects.requireNonNull(FlightPlanner.class.getResource(file)).toURI());
        List<String> flightData = Files.readAllLines(path, charset);

        flightMap = buildFlightMap(flightData);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Show the list of cities");
            System.out.println("#. Exit program");

            String input = scanner.nextLine();

            if (input.equals("#")) {
                System.out.println("Goodbye!");
                break;
            } else if (input.equals("1")) {
                displayCities();
                System.out.println("Enter the name of the city  from Which you want start your trip :");
                String startCity = scanner.nextLine();

                if (!flightMap.containsKey(startCity)) {
                    System.out.println("Wrong city name.Try again.");
                    continue;
                }

                List<String> trip = new ArrayList<>();
                trip.add(startCity);
                String currentCity = startCity;

                while (true) {
                    List<String> destinations = flightMap.get(currentCity);
                    System.out.println("From " + currentCity + ", you can fly to the following cities:");
                    displayCities(destinations);

                    System.out.println("Enter the next city (or enter 'b' to choose a different starting city):");
                    String nextCity = scanner.nextLine();

                    if (nextCity.equalsIgnoreCase("b")) {
                        System.out.println("Return to city list");
                        break;
                    } else if (!destinations.contains(nextCity)) {
                        System.out.println("Wrong city name.Try again..");
                    } else if (nextCity.equals(startCity)) {
                        System.out.println("Trip route:");
                        displayCities(trip);
                        break;
                    } else {
                        trip.add(nextCity);
                        currentCity = nextCity;
                    }
                }
            }
        }

    }

    private static Map<String, List<String>> buildFlightMap(List<String> flightData) {
        Map<String, List<String>> map = new HashMap<>();

        for (String flight : flightData) {
            if (flight.isEmpty()) {
                continue;
            }

            String[] cities = flight.split("->");
            String fromCity = cities[0].trim();
            String toCity = cities[1].trim();

            map.computeIfAbsent(fromCity, key -> new ArrayList<>()).add(toCity);
        }

        return map;
    }

    private static void displayCities() {
        System.out.println("Available cities:");
        for (String city : flightMap.keySet()) {
            System.out.println(city);
        }
    }

    private static void displayCities(List<String> cities) {
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
    

    
   


