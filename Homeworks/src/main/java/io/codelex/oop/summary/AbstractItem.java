package io.codelex.oop.summary;


public abstract class AbstractItem implements Item {
    String name;
    double price;

    public AbstractItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract String fullInfo();

}

