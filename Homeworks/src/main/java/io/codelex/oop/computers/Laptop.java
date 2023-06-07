package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer {
    private final int battery;

    public Laptop(String processor, int ram, String graphicsCard, String company, String model, int battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;

    }
public int setBattery(int battery) {
        return battery;
}
    public int getBattery() {
        return battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery=" + battery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return battery == laptop.battery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

   /*public void printComputerDetails() {
        System.out.println("Laptop details:");
        System.out.println("Processor: " + super.getProcessor());
        System.out.println("RAM: " + super.getRam() + "GB");
        System.out.println("Graphics Card: " + super.getGraphicsCard());
        System.out.println("Company: " + super.getCompany());
        System.out.println("Model: " + super.getModel());
        System.out.println("Battery: " + battery + "Wh");
    }*/


    public static void main(String[] args) {
            Laptop laptop = new Laptop("Intel i7", 16, "NVIDIA GeForce RTX 3070", "Dell", "XPS 15", 80);

            //laptop.printComputerDetails();

            laptop.setCompany("Asus");
            laptop.setModel(" Vivobook 15");
            laptop.setProcessor("Intel I5");
            laptop.setGraphicsCard("NVIDIA GeForce RTX 4500");
            laptop.setRam(8);
            laptop.setBattery(80);


        System.out.println("Company: " + laptop.getCompany());
        System.out.println("New Laptop Model: " + laptop.getModel());
        System.out.println("Processor: " + laptop.getProcessor());
        System.out.println("Graphics card: " + laptop.getGraphicsCard());
        System.out.println("RAM: " + laptop.getRam());
        System.out.println("Battery: " + laptop.getBattery() + " Wh");
        }
}
