package io.codelex.polymorphism.practice.exercise6;

class Zebra extends Mammal {
    public Zebra(String name, double weight, String livingRegion) {
        super(name, weight, livingRegion);
    }

    @Override
    public String makeSound() {
        return "IIIIĀĀĀĀĀ!";
    }

    @Override
    public boolean eatsFood(Food food) {
        return food instanceof Vegetable;
    }

    @Override
    public String getAnimalType() {
        return "Zebra";
    }

    @Override
    public String toString() {
        return "Zebra{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", livingRegion='" + livingRegion + '\'' +
                ", foodEaten=" + foodEaten +
                '}';
    }
}
