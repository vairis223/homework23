package io.codelex.oop.exercise5;

public enum ConversionType {
    METERS_TO_YARDS,
    YARDS_TO_METERS,
    CENTIMETERS_TO_INCHES,
    INCHES_TO_CENTIMETERS,
    KILOMETERS_TO_MILES,
    MILES_TO_KILOMETERS;

    public double calculate(double value) {
        return switch (this) {
            case METERS_TO_YARDS -> value * 1.09361;
            case YARDS_TO_METERS -> value / 1.09361;
            case CENTIMETERS_TO_INCHES -> value * 0.393701;
            case INCHES_TO_CENTIMETERS -> value / 0.393701;
            case KILOMETERS_TO_MILES -> value * 0.621371;
            case MILES_TO_KILOMETERS -> value / 0.621371;
        };
    }
}

