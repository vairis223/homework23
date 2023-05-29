package io.codelex.oop.exercise5;

public class MeasurementConverter {
    public static double convert(double value, ConversionType conversionType) {
        return conversionType.calculate(value);
    }
}
