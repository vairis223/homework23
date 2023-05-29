package io.codelex.oop.exercise10;

public class Cone extends Shape3D{

    public double radius;
    public double height;


    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.PI * radius *  (radius + Math.sqrt(radius * radius + height * height)));
    }

    @Override
    public double calculateVolume() {
        return Math.round((Math.PI * radius * height)/3);
    }
}
