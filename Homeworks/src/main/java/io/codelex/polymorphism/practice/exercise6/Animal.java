package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public abstract class Animal {
    public String name;
    public double weight;
    public String livingRegion;
    public int foodEaten;

    public Animal(String name, double weight, String livingRegion) {
        this.name = name;
        this.weight = weight;
        this.livingRegion = livingRegion;
        this.foodEaten = 0;
    }

    public abstract String makeSound();

    public abstract boolean eatsFood(Food food);

    public void eat(Food food) {
        this.foodEaten += food.getQuantity();
    }

    public abstract String getAnimalType();

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String weightString = decimalFormat.format(weight);
        return getAnimalType() + "[" + name + ", " + weightString + ", " + livingRegion + ", " + foodEaten + "]";
    }
}