package io.codelex.oop.exercise1;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0, 5.0);

        System.out.println("Rectangle: ");
        System.out.println("Number of sides for rectangle: " + rectangle.getNumSides());
        System.out.println("Width : " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area for rectangle is: " + rectangle.getArea());
        System.out.println("Perimeter for rectangle is: " + rectangle.getPerimeter());
        System.out.println();

        Triangle triangle = new Triangle(6.0, 4.0);
        System.out.println("Triangle: ");
        System.out.println("Number of sides for triangle: " + triangle.getNumSides());
        System.out.println("Width : " + triangle.getWidth());
        System.out.println("Height: " + triangle.getHeight());
        System.out.println("Area for triangle is: " + triangle.getArea());
        System.out.println();

        try {
            System.out.println("Perimeter for triangle is: " + triangle.getPerimeter());
        } catch (UnsupportedOperationException e) {
            System.out.println("For perimeter calculation for triangle needs to know 3 sides");
        }

    }
}
