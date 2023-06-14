package io.codelex.praktiskaisdarbs.exercise2;

public class BasketEmptyException extends RuntimeException {
    BasketEmptyException() {
        super("Basket is empty");
    }
}
