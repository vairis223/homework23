package io.codelex.oop.summary;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class FoodItem extends AbstractItem {
    private LocalDate bestBefore;

    public FoodItem(String name, double price, LocalDate date) {
        super(name, price);
        this.bestBefore = date;
    }

    public String fullInfo() {
        return getName() + ", " + getPrice() + " EUR, best before: " + bestBefore.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }
}