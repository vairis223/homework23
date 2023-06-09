package io.codelex.polymorphism.practice.exercise6;

class Tiger extends Feline {
    public Tiger(String name, double weight, String livingRegion) {
        super(name, weight, livingRegion);
    }

    @Override
    public String makeSound() {
        return "ROAARRRRR!!!";
    }

    @Override
    public boolean eatsFood(Food food) {
        return food instanceof Meat;
    }

    @Override
    public String getAnimalType() {
        return "Tiger";
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", livingRegion='" + livingRegion + '\'' +
                ", foodEaten=" + foodEaten +
                '}';
    }
}