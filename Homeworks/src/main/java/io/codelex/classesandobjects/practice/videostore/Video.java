package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean checkOut;
    private double averageRating;
    private int numberOfRatings;



    public Video(String title) {
        this.title = title;
        this.checkOut = false;
        this.averageRating = 0.0;
        this.numberOfRatings = 0;
    }

    public String getTitle() {
        return title;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setCheckOut() {
        this.checkOut = true;
    }

    public void returnVideo() {
        this.checkOut = false;

    }

    public boolean checkOut() {
        return checkOut;

    }

    public void receiveRating(int rating) {
        double totalRating = averageRating * numberOfRatings;
        totalRating += rating;
        numberOfRatings++;
        averageRating = totalRating / numberOfRatings;


    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", checkOut=" + checkOut +
                ", averageRating=" + averageRating +
                ", numberOfRatings=" + numberOfRatings +
                '}';
    }
}

