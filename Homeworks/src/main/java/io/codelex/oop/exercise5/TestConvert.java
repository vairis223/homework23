package io.codelex.oop.exercise5;

public class TestConvert {
    public static void main(String[] args) {
        double value = 35.0;

        double metersToYardsResult = MeasurementConverter.convert(value, ConversionType.METERS_TO_YARDS);
        System.out.println(value + " meters = " + metersToYardsResult + " yards");

        double yardsToMetersResult = MeasurementConverter.convert(value, ConversionType.YARDS_TO_METERS);
        System.out.println(value + " yards = " + yardsToMetersResult + " meters");

        double cmToInchesResult = MeasurementConverter.convert(value, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(value + " centimeters = " + cmToInchesResult + " inches");

        double inchesToCmResult = MeasurementConverter.convert(value, ConversionType.INCHES_TO_CENTIMETERS);
        System.out.println(value + " inches = " + inchesToCmResult + " centimeters");

        double kmToMilesResult = MeasurementConverter.convert(value, ConversionType.KILOMETERS_TO_MILES);
        System.out.println(value + " kilometers = " + kmToMilesResult + " miles");

        double milesToKmResult = MeasurementConverter.convert(value, ConversionType.MILES_TO_KILOMETERS);
        System.out.println(value + " miles = " + milesToKmResult + " kilometers");
    }
}
