package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private String dimension;
    private int numOfCopies;
    private double costPerCopy;

    public Poster(int fee, String dimension, int numOfCopies, double costPerCopy) {
        super(fee);
        this.dimension = dimension;
        this.numOfCopies = numOfCopies;
        this.costPerCopy = costPerCopy;
    }
    public int cost() {
        return super.cost() + (int) (numOfCopies * costPerCopy);
    }

    @Override
    public String toString() {
        return super.toString()
                + " Poster: Dimensions=" + dimension
                + " Number of Copies=" + numOfCopies
                + " Cost per Copy=" + costPerCopy;
    }
}

