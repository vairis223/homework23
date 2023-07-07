package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0 -> System.exit(0);
                case 1 -> fillVideoStore(keyboard);
                case 2 -> rentVideo(keyboard);
                case 3 -> returnVideo(keyboard);
                default -> System.out.println("Mistake in input. Please try again!");
            }
            }

        }


    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            //todo - add video
            System.out.println("Enter video name: ");
            String videoName = scanner.next();



        }
    }

    private static void rentVideo(Scanner scanner) {
        //todo - rent video
        System.out.println("Enter movie name you want to rent: ");
        String title = scanner.next();
        VideoStore.checkOutVideo(title);
    }

    private static void returnVideo(Scanner scanner) {
        //todo - return video
        System.out.println("Enter movie name that you want to return: ");
        String title = scanner.next();
        VideoStore.returnVideo(title);
    }
}
