package io.codelex.oop.computers;

public class ComputersTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Intel i7", 16, "NVIDIA GeForce RTX 3070", "Dell", "XPS 15");
        Computer computer2 = new Computer("AMD Ryzen 9", 32, "NVIDIA GeForce RTX 3080", "Asus", "ROG Strix G17");
        Computer computer3 = new Computer("Intel i5", 8, "AMD Radeon RX 5700 XT", "HP", "Pavilion 15");
        Computer computer4 = new Computer("AMD Ryzen 7", 16, "NVIDIA GeForce GTX 1660 Ti", "Lenovo", "Legion 5");


        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);
        System.out.println(computer4);

        System.out.println(computer1.equals(computer2));
        System.out.println(computer3.equals(computer4));
    }
}
