package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

//TODO: Add 10 values to list
        cars.add("BMW");
        cars.add("Opel");
        cars.add("Audi");
        cars.add("Tesla");
        cars.add("Volkswagen");
        cars.add("Skoda");
        cars.add("Citroen");
        cars.add("Renault");
        cars.add("Jaguar");
        cars.add("Ferrari");
        cars.add("Dacia");
        System.out.println(cars);


//TODO: Add new value at 5th position
        cars.add(5, "Dodge");
        System.out.println(cars);

//TODO: Change value at last position (Calculate last position programmatically)
        int lastPos = cars.size() - 1;
        cars.set(lastPos, "Lamborghini");
        System.out.println(cars);

//TODO: Sort your list in alphabetical order
        cars.sort(String::compareTo);
        System.out.println(cars);

//TODO: Check if your list contains "Foobar" element
        if (cars.contains("Foobar")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
//TODO: Print each element of list using loop
        for (String car : cars) {
            System.out.println(car);
        }


    }

}
