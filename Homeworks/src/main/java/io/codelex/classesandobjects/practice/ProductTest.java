package io.codelex.classesandobjects.practice;

public class ProductTest {
    public static void main(String[] args) {
        Product mouse = new Product("Logitech mouse", 70.00, 14);
        Product iphone = new Product("iPhone 5s", 999.99, 3);
        Product projector = new Product("Epson EB-U05", 440.46, 1);

        mouse.printProduct();
        iphone.printProduct();
        projector.printProduct();

        System.out.println();

        mouse.setAmount(20);
        iphone.setPrice(899.99);

        System.out.println("After changing price and quantity: ");
        mouse.printProduct();
        iphone.printProduct();
        projector.printProduct();
    }
}
