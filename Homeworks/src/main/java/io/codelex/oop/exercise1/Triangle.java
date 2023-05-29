package io.codelex.oop.exercise1;

public class Triangle extends Shape{
    double width;
    double height;

    public Triangle(double height, double width) {
        super(3);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {

        return 0.5 * width * height;
    }

    @Override
    public double getPerimeter() {

        //return a + b + c ;
        throw new UnsupportedOperationException("For perimeter calculation for triangle needs to know 3 sides");
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
