package io.codelex.oop.summary;

import java.time.LocalDate;


public class OrderProgram {
    public static void main(String[] args) {
            try {
                FoodItem milk = new FoodItem("Milk", 0.75, LocalDate.of(2024, 4, 1));
                ElectronicsItem radio = new ElectronicsItem("Radio", 25.00, 100);
                ElectronicsItem laptop = new ElectronicsItem("Laptop", 750.00, 450);
                HouseholdItem bucket = new HouseholdItem("Bucket", 5.00, "red");
                ItemPacking itemPacking = new ItemPacking();

                Order order = new Order();
                order.addItem(milk);
                order.addItem(radio);
                order.addItem(laptop);
                order.addItem(bucket);
                order.addItem(itemPacking);

                Invoice invoice = new Invoice(order, "INV123");
                System.out.println(invoice.getFormattedInvoice());
            } catch (WrongOrderException | BadFoodException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }