package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;

public class DatePeriod {
    public static void main(String[] args) {
        String StartStr1 = "2022-01-01";
        String EndStr1 = "2022-01-15";
        String StartStr2 = "2022-01-10";
        String EndStr2 = "2022-01-25";

        LocalDate firstStart = LocalDate.parse(StartStr1);
        LocalDate firstEnd = LocalDate.parse(EndStr1);
        LocalDate secondStart = LocalDate.parse(StartStr2);
        LocalDate secondEnd = LocalDate.parse(EndStr2);

        if (firstEnd.isBefore(firstStart) || secondEnd.isBefore(secondStart)) {
            System.out.println("Not proper intervals");
        } else {
            long numberOfOverlappingDates;
            if (firstEnd.isBefore(secondStart) || secondEnd.isBefore(firstStart)) {
                numberOfOverlappingDates = 0;
            } else {
                LocalDate laterStart = Collections.max(Arrays.asList(firstStart, secondStart));
                LocalDate earlierEnd = Collections.min(Arrays.asList(secondEnd, firstEnd));
                numberOfOverlappingDates = ChronoUnit.DAYS.between(laterStart, earlierEnd);
            }
            System.out.println(numberOfOverlappingDates + " days of overlap");
        }
    }
}
