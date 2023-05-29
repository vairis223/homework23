package io.codelex.oop.exercise9;

public class TestRun {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8,6);
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        Hexagon hexagon = new Hexagon(9);
        System.out.println("Hexagon perimeter: " + hexagon.calculatePerimeter());
        System.out.println("Hexagon area: " + hexagon.calculateArea());

        Triangle triangle = new Triangle(5,5);
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
}
