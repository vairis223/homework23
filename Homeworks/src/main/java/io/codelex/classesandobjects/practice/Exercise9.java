package io.codelex.classesandobjects.practice;

import java.awt.*;
<<<<<<< Updated upstream

public class Exercise9 {
    int x;
    int y;

    public Exercise9(int x) {
        this.x = x;
        this.y = y;
    }

    public static void swap(Point p1, Point p2) {
        int X = p1.x;
        int Y = p1.y;

        p1.x = p2.x;
        p1.y = p2.y;

        p2.x = X;
        p2.y = Y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swap(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }
}
=======
    public class Exercise9 {
        int x;
        int y;

        public Exercise9(int x) {
            this.x = x;
            this.y = y;
        }

        public static void swap(Point p1, Point p2) {
            int X = p1.x;
            int Y = p1.y;

            p1.x = p2.x;
            p1.y = p2.y;

            p2.x = X;
            p2.y = Y;
        }


    }
>>>>>>> Stashed changes
