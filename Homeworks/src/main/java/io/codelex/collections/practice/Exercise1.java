package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        List<String> list = Arrays.asList(array);
        System.out.println("List: " + list);
        //todo - replace array with an ArrayList and print out the results
        Set<String> set = new HashSet<>(Arrays.asList(array));
        System.out.println("Set: " + set);
        //todo - replace array with a HashSet and print out the results

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> brandOrigination = new HashMap<>();

        for (String brand : array) {
            switch (brand) {
                case "Audi" -> brandOrigination.put(brand, "Germany");
                case "BMW" -> brandOrigination.put(brand, "Germany");
                case "Honda" -> brandOrigination.put(brand, "Japan");
                case "Mercedes" -> brandOrigination.put(brand, "Germany");
                case "VolksWagen" -> brandOrigination.put(brand, "Germany");
                case "Tesla" -> brandOrigination.put(brand, "USA");
            }
        }
        for (Map.Entry<String, String> entry : brandOrigination.entrySet()) {
            System.out.println("Brand: " + entry.getKey() + ", Origination: " + entry.getValue());
        }
    }
}




