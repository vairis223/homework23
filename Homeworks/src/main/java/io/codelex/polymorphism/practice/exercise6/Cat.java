package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

class Cat extends Feline {
    private String breed;

    public Cat(String name, double weight, String livingRegion, String breed) {
        super(name, weight, livingRegion);
        this.breed = breed;
    }

   @Override
   public String makeSound() {
        return "Meeeeeooooowwwww!";
    }

    @Override
    public boolean eatsFood(Food food) {
        return true;
    }

    @Override
    public String getAnimalType() {
        return "Cat";
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String weightString = decimalFormat.format(weight);
        return getAnimalType() + "[" + name + ", " + breed + ", " + weightString + ", " + livingRegion + ", " + foodEaten + "]";
    }
}
