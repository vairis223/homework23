package io.codelex.oop.summary;


public class HouseholdItem extends AbstractItem {

    private String color;


    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    public String fullInfo() {
        return getName() + ", " + getPrice() + " EUR, color: " + color;
    }

}
