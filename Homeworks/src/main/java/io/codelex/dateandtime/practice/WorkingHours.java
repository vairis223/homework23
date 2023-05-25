package io.codelex.dateandtime.practice;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class WorkingHours {
    private static final int WORKING_HOURS_DAY = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start date (YYYY-MM-DD): ");
        String startDateSTr = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(startDateSTr, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("Enter the end date (YYYY-MM-DD): ");
        String endDateStr = scanner.nextLine();
        LocalDate endDate = LocalDate.parse(endDateStr, DateTimeFormatter.ISO_LOCAL_DATE);

        int hoursTotal = calculateHours(startDate, endDate);
        System.out.println(hoursTotal + " working hours!");
    }

    public static int calculateHours(LocalDate startDate, LocalDate endDate) {

        int hoursTotal = 0;
        LocalDate currentDate = startDate;

        while (!currentDate.isAfter(endDate)) {
            if (isWorkingDay(currentDate) && !isHoliday(currentDate)) {
                hoursTotal += WORKING_HOURS_DAY;
            }
            currentDate = currentDate.plusDays(1);
        }
        return hoursTotal;
    }

    public static boolean isWorkingDay(LocalDate date) {
        return date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY;

    }

    public static boolean isHoliday(LocalDate date) {
        int year = date.getYear();
        Month month = date.getMonth();
        int day = date.getDayOfMonth();

        if (month == Month.JANUARY && day == 1) {
            return true;
        }
        if (month == Month.APRIL && day == 7) {
            return true;
        }
        if (month == Month.APRIL && day == 10) {
            return true;
        }
        if (month == Month.MAY && day == 1) {
            return true;
        }
        if (month == Month.MAY && day == 4) {
            return true;
        }
        if (month == Month.JUNE && day == 23) {
            return true;
        }
        if (month == Month.MAY && day == 24) {
            return true;
        }
        if (month == Month.NOVEMBER && day == 18) {
            return true;
        }
        if (month == Month.DECEMBER && day == 23) {
            return true;
        }
        if (month == Month.DECEMBER && day == 25) {
            return true;
        }
        if (month == Month.DECEMBER && day == 26) {
            return true;
        }
        if (month == Month.DECEMBER && day == 31) {
            return true;
            }
        return false;
    }
}

