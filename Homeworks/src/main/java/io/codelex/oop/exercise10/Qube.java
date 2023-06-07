package io.codelex.oop.exercise10;

public class Qube extends Shape3D{

    double sideLength;

    public Qube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 6* ( sideLength * sideLength);
    }

    @Override
    public double calculateVolume() {
        return sideLength * sideLength * sideLength;
    }
}
