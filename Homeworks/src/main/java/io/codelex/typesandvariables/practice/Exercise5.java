package io.codelex.typesandvariables.practice;



public class Exercise5 {
    public static void main(String[] args) {
        String course1 = "English";
        String teacher1 = "Ms. Vehi";
        String course2 = "Music";
        String teacher2 = "Ms. Stikute";
        String course3 = "Biology";
        String teacher3 = "Ms. Feldmane";
        String course4 = "Latvian";
        String teacher4 = "Ms. Vilcina";
        String course5 = "History";
        String teacher5 = "Mr. Beldavs";

        System.out.println("+" + "-".repeat(33) + " + ");
        System.out.printf("|%1s|%-15s|%-15s|\n", "1", course1, teacher1);
        System.out.printf("|%1s|%-15s|%-15s|\n", "2", course2, teacher2);
        System.out.printf("|%1s|%-15s|%-15s|\n", "3", course3, teacher3);
        System.out.printf("|%1s|%-15s|%-15s|\n", "4", course4, teacher4);
        System.out.printf("|%1s|%-15s|%-15s|\n", "5", course5, teacher5);
        System.out.println("+" + "-".repeat(33) + " + ");
    }
}




