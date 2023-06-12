package io.codelex.oop.summary;


public class ElectronicsItem extends AbstractItem {

    private int power;

    public ElectronicsItem(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    public ElectronicsItem(String name, double price) {
        super(name, price);
    }

    public String fullInfo() {
        return getName() + ", " + getPrice() + " EUR, power: " + power + "W";
    }
}
