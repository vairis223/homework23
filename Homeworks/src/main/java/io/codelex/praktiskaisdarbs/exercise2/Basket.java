package io.codelex.praktiskaisdarbs.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> items;
    private int count;
    private static final int MAX_CAPACITY = 10;

    public Basket() {
        this.items = new ArrayList<>();
        this.count = 0;
    }

    public void addToBasket(T item) {
        if (count == MAX_CAPACITY) {
            throw new BasketFullException();
        }
        items.add(item);
        count++;
    }
    public void removeFromBasket(T item) {
        if (count == 0) {
            throw new BasketEmptyException();
        }
        items.remove(item);
        count--;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "items=" + items +
                ", count=" + count +
                '}';
    }
}
