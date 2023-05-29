package io.codelex.oop.exercise9;

public class Triangle extends Shape{
    double base;
    double height;



    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return base * 3;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }
}
