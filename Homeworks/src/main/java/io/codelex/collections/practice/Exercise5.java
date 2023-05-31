package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {
    public static int isHappyNumber(int num){

                int rem;
                int sum = 0;

            while (num > 0) {
                rem = num % 10;
                sum = sum + (rem * rem);
                num = num / 10;
            }
            return sum;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            int result = num;

            while (result != 1 && result != 4) {
                result = isHappyNumber(result);
            }

            if (result == 1)
                System.out.println(num + " is a happy number");
            else if (result == 4)
                System.out.println(num + " is not a happy number");
        }
    }


