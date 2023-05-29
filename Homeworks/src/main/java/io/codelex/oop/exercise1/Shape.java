package io.codelex.oop.exercise1;

public abstract class Shape {
    double numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }
    public double getNumSides() {
        return numSides;
    }
    public abstract double getArea();

    public abstract double getPerimeter() ;
    }

