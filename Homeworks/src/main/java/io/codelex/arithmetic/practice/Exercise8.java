package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise8 {
    static double minimumWage = 8.0;
    static int maxHours = 60;
    static double basePay = 0;
    static int hoursWorked = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Data for employee number: " + i);
            System.out.println("Enter base pay: ");
            basePay = scanner.nextInt();
            System.out.println("Enter hours worked:");
            hoursWorked = scanner.nextInt();
            calculator();

        }
    }

    public static void calculator() {
        double totalPay = 0;
        if ((basePay < minimumWage) || (hoursWorked > maxHours)) {
            System.out.println("Error!");
        } else {
            if (hoursWorked > 40) {
                totalPay = basePay * 40 + 1.5 * basePay * (hoursWorked - 40);
            } else {
                totalPay = basePay * hoursWorked;
            }
            System.out.println("Total salary is: " + totalPay);

        }
    }
}
