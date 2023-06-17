package io.codelex.exercise2;

import io.codelex.praktiskaisdarbs.exercise2.Apple;
import io.codelex.praktiskaisdarbs.exercise2.Basket;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketTest {
    @Test
    public void testAddBasket() {
        Basket<Apple> appleBasket = new Basket<>();
        assertEquals(0, appleBasket.getCount());

        appleBasket.addToBasket(new Apple());
        assertEquals(1,appleBasket.getCount());
    }
    public void testRemoveBasket() {
        Basket<Apple> appleBasket = new Basket<>();
        assertEquals(0,appleBasket.getCount());

        appleBasket.removeFromBasket(new Apple());
        assertEquals(0,appleBasket.getCount());
    }
}
