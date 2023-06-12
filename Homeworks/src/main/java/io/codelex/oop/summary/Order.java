package io.codelex.oop.summary;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private List<SellableThing> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(SellableThing item) throws BadFoodException {
        if (item instanceof FoodItem) {
            FoodItem foodItem = (FoodItem) item;
            if (foodItem.getBestBefore().isBefore(LocalDate.now())) {
                throw new BadFoodException("Cannot add expired food item to the order.");
            }
        }
        items.add(item);
    }

    public List<SellableThing> getItems() {
        return items;
    }

    public String getOrderItems() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            SellableThing item = items.get(i);
            builder.append((i + 1)).append(". ").append(item.fullInfo()).append("\n");
        }
        return builder.toString();
    }
}

