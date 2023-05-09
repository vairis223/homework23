package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long minutes;
        int days;
        int years;
        final int minutesInYear = 60 * 24 * 365;

        System.out.print("Enter the number of minutes: ");
        minutes = scanner.nextLong();

        years = (int) (minutes / minutesInYear);
        days = (int) (minutes / 60 / 24) % 365;
        System.out.println(minutes + " minutes is " + years + " years and " + days + " days.");
    }
}
