package io.codelex.oop.exercise9;

public class Hexagon extends Shape{

    private final double side;

    public Hexagon(double side) {
        this.side = side;
    }
    @Override
    public double calculatePerimeter() {
        return 6 * side;
    }

    @Override
    public double calculateArea() {
        return Math.round((3 * Math.sqrt(3) * side * side) / 2);
    }
}
