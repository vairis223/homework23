package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {
    public static ArrayList <Video> inventory = new ArrayList<>();

    public VideoStore() {
        inventory = new ArrayList<>();

    }
    public void addVideo(Video video) {
        inventory.add(new Video("The Matrix"));
        inventory.add(new Video("Godfather II"));
        inventory.add(new Video("Star Wars Episode IV: A New Hope"));


    }

    public static void checkOutVideo(String title) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                if (video.checkOut()) {
                    System.out.println("Video " + title + "checked out!");
                } else {
                    System.out.println("Video is already checked out");
                }
                return;
            }
        }
        System.out.println("Video not found!");
    }

    public static void returnVideo(String title) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                if (!video.checkOut()) {
                    video.returnVideo();
                    System.out.println("Video " + title + "returned!");
                } else {
                    System.out.println("Video is already in store");
                }
                return;
            }
        }
        System.out.println("Video not found!");
    }

    public static void receiveRating(String title, int rating) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                if (!video.checkOut()) {
                    video.receiveRating(rating);
                    System.out.println("For video " + title + " received rating!");
                    return;
                }
            }
        }
    }
}



