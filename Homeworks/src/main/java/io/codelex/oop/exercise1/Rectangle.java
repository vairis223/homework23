package io.codelex.oop.exercise1;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        super(4);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
return 2 * (width * height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
