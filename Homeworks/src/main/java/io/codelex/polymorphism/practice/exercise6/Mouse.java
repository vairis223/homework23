package io.codelex.polymorphism.practice.exercise6;

class Mouse extends Mammal {
    public Mouse(String name, double weight, String livingRegion) {
        super(name, weight, livingRegion);
    }

    @Override
    public String makeSound() {
        return "Peeee ,Peeee!";
    }

    @Override
    public boolean eatsFood(Food food) {
        return food instanceof Vegetable;
    }

    @Override
    public String getAnimalType() {
        return "Mouse";
    }


    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", livingRegion='" + livingRegion + '\'' +
                ", foodEaten=" + foodEaten +
                '}';
    }
}