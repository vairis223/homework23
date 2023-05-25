package io.codelex.loops.practice;

import java.util.Scanner;
import java.util.Random;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Desired sum: ");
        int desiresSum = scanner.nextInt();

        int num1;
        int num2;
        int sum;

        do {
            num1 = random.nextInt(6) + 1;
            num2 = random.nextInt(6) + 1;
            sum = num1 + num2;
            System.out.println(num1 + " and " + num2 + " = " + sum);
        } while (sum != desiresSum);
    }
}
