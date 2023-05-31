package io.codelex.collections.practice;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); {
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter people names one per line:");
        String name = scanner.nextLine();

        while (!name.isEmpty()) {
            names.add(name);
        name = scanner.nextLine();
        }
        Set<String> uniqueNames = new HashSet<>(names);

        System.out.println("Unique name list contains: " );
        for (String uniqueName : uniqueNames) {
            System.out.println(uniqueName + " ");
        }

    }
}
