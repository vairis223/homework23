package io.codelex.praktiskaisdarbs.exercise2;

public class BasketFullException extends RuntimeException{
    public BasketFullException() {
        super("Basket full");
    }
}
