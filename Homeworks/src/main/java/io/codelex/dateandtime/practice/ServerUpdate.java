package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ServerUpdate {

    public static void calculateUpdate(LocalDate launchDate,int year, int month) {
        YearMonth targetMonth = YearMonth.of(year, month);
        LocalDate currentDate = launchDate;

        while (currentDate.isBefore(targetMonth.atEndOfMonth())) {
            System.out.println("New update date is: " + currentDate);
            currentDate = currentDate.plusDays(14);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter server launch date (yyyy-mm-dd) : ");
        String launchDate = in.nextLine();
        LocalDate startDate = LocalDate.parse(launchDate);

        System.out.println("Enter the year you want: ");
        int year = in.nextInt();

        System.out.println("Enter the month you want: ");
        int month = in.nextInt();

        calculateUpdate(startDate, year, month);
    }
}
