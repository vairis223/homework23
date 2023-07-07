package io.codelex.classesandobjects.practice;

import java.awt.*;

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

