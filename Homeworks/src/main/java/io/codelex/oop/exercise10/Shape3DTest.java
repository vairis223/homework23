package io.codelex.oop.exercise10;

public class Shape3DTest {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Perimeter for Qube and cone not calculabe.");
        System.out.println();

        Cone cone = new Cone(5.0, 7.0);
        System.out.println("Cone surface area: " + cone.calculateArea());
        System.out.println("Cone volume: " + cone.calculateVolume());
        System.out.println();

        Qube qube = new Qube(7);
        System.out.println("Qube surface area: " + qube.calculateArea());
        System.out.println("Qube volume: " + qube.calculateVolume());
    }
}
