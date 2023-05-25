package io.codelex.classesandobjects.practice;

public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.amount = amountAtStart;
        this.price = priceAtStart;
    }

    public void printProduct() {
        System.out.println(name + ", price " + price + ", amount " + amount);
    }

    public void setAmount(int newAmount) {
        this.amount = newAmount;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }


}
