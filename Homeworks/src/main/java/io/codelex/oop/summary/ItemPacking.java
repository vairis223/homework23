package io.codelex.oop.summary;


class ItemPacking implements Service {
    private static final String NAME = "Item packing";
    private static final double PRICE = 5.00;

    public String getName() {
        return NAME;
    }

    public double getPrice() {
        return PRICE;
    }

    public String fullInfo() {
        return getName() + ", " + getPrice() + " EUR";
    }
}