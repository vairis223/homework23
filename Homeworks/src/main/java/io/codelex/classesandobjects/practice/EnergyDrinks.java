package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        double energyDrinkers = calculateEnergyDrinkers();
        double preferCitrus = calculatePreferCitrus();
        //fixme
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }

    private static double calculateEnergyDrinkers() {
        return NUMBERED_SURVEYED * PURCHASED_ENERGY_DRINKS;
    }

    public static double calculatePreferCitrus() {

        return calculateEnergyDrinkers() * PREFER_CITRUS_DRINKS;
    }
}
